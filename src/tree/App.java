package tree;

public class App {
    public static void main(String[] args) throws Exception {
        RedBlackTree tree = new RedBlackTree();
        tree.add(0);
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(10);
        tree.add(11);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(14);
        tree.add(15);
        tree.add(16);
        tree.add(7);
        tree.add(8);
        tree.add(9);
  

        System.out.println(tree.root);
    }
}
