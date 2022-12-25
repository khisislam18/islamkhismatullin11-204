package sweeper;

import java.awt.*;

public class Game {
    private Bomb bomb;
    private Flag flag;
    private GameState state;

    public Game(int cols, int rows, int bombs) {
        Ranges.setSize(new Coord(cols, rows));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start() {
        bomb.start();
        flag.start();
        state = GameState.PLAYED;
    }

    public GameState getState() {
        return state;
    }

    public Box getBox(Coord coord) {
        if (flag.get(coord) == Box.OPENED) {
            return bomb.get(coord);
        } else {
            return flag.get(coord);
        }
    }

    public void pressLeftButton(Coord coord) {
        if (gameOver()) {
            return;
        }
        openBox(coord);
        checkWinner();
    }

    private void openBoxesAround(Coord coord) {
        flag.setOpenedToBox(coord);
        for (Coord around : Ranges.getCoordAround(coord)) {
            openBox(around);
        }
    }

    private void checkWinner() {
        if (state == GameState.PLAYED) {
            if (flag.getCountOfClosedBoxes() == bomb.getTotalBombs()) {
                state = GameState.WINNER;
            }
        }
    }

    private void openBox(Coord coord) {
        switch (flag.get(coord)) {
            case OPENED:
                setOpenedToClosedBoxesAroundNumber(coord);
                return;
            case FLAGED:
                return;
            case CLOSED:
                switch (bomb.get(coord)) {
                    case ZERO:
                        openBoxesAround(coord);
                        return;
                    case BOMB:
                        openBombs(coord);
                        return;
                    default:
                        flag.setOpenedToBox(coord);
                }
        }
    }

    public void openBombs(Coord coord) {
        state = GameState.BOMBED;
        flag.setBombedToBox(coord);
        for (Coord coord1 : Ranges.getAllCoords()) {
            if (Box.BOMB == bomb.get(coord1)) {
                flag.setOpenedToClosedBombBox(coord1);
            } else {
                flag.setNoBombToFlagedSafeBox(coord1);
            }
        }
    }

    public void pressRightButton(Coord coord) {
        if(gameOver()){
            return;
        }
        flag.toggleFlagedToBox(coord);
    }

    private boolean gameOver() {
        if (state == GameState.PLAYED || state == GameState.WELCOME) {
            return false;
        }
        start();
        return true;
    }

    void setOpenedToClosedBoxesAroundNumber(Coord coord) {
        if (bomb.get(coord) != Box.BOMB) {
            if (flag.getCountOfFlagedBoxesAround(coord) == bomb.get(coord).getNumber()) {
                for (Coord around : Ranges.getCoordAround(coord)) {
                    if (flag.get(around) == Box.CLOSED) {
                        openBox(around);
                    }
                }
            }
        }
    }
}
