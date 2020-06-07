package lab7;




public class Node {
    private Wagon wagon;
    private Node next;
    private Node previous;

    public Node(Wagon wagon, Node next, Node previous) {
        this.wagon = wagon;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}
