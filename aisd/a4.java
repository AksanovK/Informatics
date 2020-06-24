public class a4 {
    public static void main(String[] args) {
        Node<Integer> leftTree = new Node<>(5);
        leftTree.setLeftChild(new Node<>(3));
        leftTree.setRightChild(new Node<>(7));
        Node<Integer> root = new Node<>(10);
        Node<Integer> rightTree = new Node<>(15);
        rightTree.setLeftChild(new Node<>(12));
        rightTree.setRightChild(new Node<>(20));
        root.setLeftChild(leftTree);
        root.setRightChild(rightTree);

        String print = printTree(root);
        System.out.println(print);
    }

    public static String printTree (Node node){
        String s = "";
        s += "(";
        s += node.getValue() + ", ";
        if (node.getLeftChild() != null){
            s += printTree(node.getLeftChild()) + ", ";
        } else {
            s += "NULL, ";
        }
        if (node.getRightChild() != null){
            s += printTree(node.getRightChild());
        } else {
            s += "NULL";
        }
        s += ")";
        return s;
    }
}
