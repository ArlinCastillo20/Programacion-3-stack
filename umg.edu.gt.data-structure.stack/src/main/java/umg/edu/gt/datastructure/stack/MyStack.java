package umg.edu.gt.datastructure.stack;

public class MyStack {

    private Node top;
    private int count;

    public MyStack() {
        this.top = null;
        this.count = 0;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }

        char data = top.data;
        top = top.next;
        count--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getCount() {
        return count;
    }

    public Node getNodeInit() {
        return top;
    }
}