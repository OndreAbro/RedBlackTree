public class Main {

//    public static void preorder(TreeNode node) {
//        if (node != null) {
//            System.out.print(node.value + " ");
//            preorder(node.left);
//            preorder(node.right);
//        }
//    }
//
//    public static void inorder(TreeNode node) {
//        if (node != null) {
//            inorder(node.left);
//            System.out.print(node.value + " ");
//            inorder(node.right);
//        }
//    }
//
//    public static void postorder(TreeNode node) {
//        if (node != null) {
//            postorder(node.left);
//            postorder(node.right);
//            System.out.print(node.value + " ");
//        }
//    }
//
    public static void printTree(Node node, String prefix) {
        if (node != null) {
            System.out.println(prefix + node.value + "(" + node.color + ")");
            printTree(node.left, prefix + "-");
            printTree(node.right, prefix + "-");
        }
    }

    public static void main(String[] args) {

        final RedBlackTree tree = new RedBlackTree();

        tree.add(2);
        tree.add(5);
        tree.add(30);
        tree.add(3);
        tree.add(6);
        tree.add(20) ;
        tree.add(25);
        tree.add(15);
        tree.add(18);

        printTree(tree.root, "");

    }
}
