public class Node {
    Goods data;
    Node next;

    public Node(Goods d) {
        data = d;
        next = null;
    }

    public Node(Goods d, Node n) {
        data = d;
        next = n;
    }
}
