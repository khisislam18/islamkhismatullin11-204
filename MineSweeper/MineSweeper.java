import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sweeper.Box;
import sweeper.Coord;
import sweeper.Game;
import sweeper.Ranges;

public class MineSweeper extends JFrame {
    private Game game;
    private JPanel jPanel;
    private JLabel jLabel;
    private final int COLS = 16;
    private final int ROWS = 16;
    private final int BOMBS = 40;
    private final int IMAGE_SIZE = 50;
    public static void main(String[] args) {
        new MineSweeper();
    }

    private MineSweeper(){
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
        setImages();
        initLabel();
        initPanel();
        initFrame();
    }

    private void initLabel(){
        jLabel = new JLabel("Welcome!");
        add(jLabel, BorderLayout.NORTH);

    }
    private void initPanel(){
        jPanel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                for(Coord coord : Ranges.getAllCoords()){
                    g.drawImage((Image)game.getBox(coord).image, coord.x * IMAGE_SIZE, coord.y * IMAGE_SIZE, this);
                }
            }
        };
        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / IMAGE_SIZE;
                int y = e.getY() / IMAGE_SIZE;
                Coord coord  = new Coord(x, y);
                if (e.getButton() == MouseEvent.BUTTON1){
                    game.pressLeftButton (coord);
                }
                if(e.getButton() == MouseEvent.BUTTON3){
                    game.pressRightButton(coord);
                }
                if(e.getButton() == MouseEvent.BUTTON2){
                    game.start();
                }
                jLabel.setText(getMessage());
                jPanel.repaint();
            }
        });
        jPanel.setPreferredSize(new Dimension(
                Ranges.getSize().x * IMAGE_SIZE,
                Ranges.getSize().y * IMAGE_SIZE)
        );
        add(jPanel);
    }
    private String getMessage(){
        switch (game.getState()){
            case PLAYED: return "Have Fun!!";
            case BOMBED: return "BABAH!! You have lost! Try again!";
            case WINNER: return "Congratulations!";
            default: return "";
        }
    }
    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setIconImage(getImage("icon"));
    }

    private void setImages(){
        for(Box box : Box.values()){
            box.image = getImage(box.name().toLowerCase());
        }
    }

    private Image getImage (String name){
        String filepath = "C:\\Users\\ASUS\\Desktop\\Новая папка\\islamkhismatullin11-204\\MineSweeper\\res\\img\\" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(filepath);
        return icon.getImage();
    }
}