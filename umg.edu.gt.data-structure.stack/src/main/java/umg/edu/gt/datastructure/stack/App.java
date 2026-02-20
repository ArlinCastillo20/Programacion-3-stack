package umg.edu.gt.datastructure.stack;

public class App {
    public static void main(String[] args) {

    MyStack stack = new MyStack();

    stack.push('a');
    stack.push('b');
    stack.push('c');

    System.out.println("Cantidad: " + stack.getCount());

    Node n = stack.getNodeInit();
    System.out.println("Nodo inicial: " + (n != null ? n.data : "null"));

    System.out.println("Pop: " + stack.pop());
    System.out.println("Cantidad luego pop: " + stack.getCount());
}

}