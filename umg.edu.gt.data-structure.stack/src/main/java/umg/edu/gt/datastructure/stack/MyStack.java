package umg.edu.gt.datastructure.stack;

public class MyStack {

    private Node top;

    public MyStack() {
        this.top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}