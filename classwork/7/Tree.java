import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tree {

    private int value;
    private Tree left;
    private Tree right;

    public int sum(){
        return value + (left != null ? left.sum() : 0) + (right != null ? right.sum() : 0);
    }

    public static void main(String[] args) {
        Tree tree = new Tree(20,new Tree(7, new Tree(4,null,new Tree(6,null,null)),new Tree(9,null,null)),
                new Tree(35,new Tree(31,new Tree(28,null,null),null),
                        new Tree(40,new Tree(38,null,null), new Tree(52,null,null))));
        System.out.println(tree);
        System.out.println(tree.sum());
    }
}