package umg.edu.gt.datastructure.stack;

public class App {

    static class Stack {
        private int[] data;
        private int top;

        public Stack(int capacity) {
            data = new int[capacity];
            top = -1;
        }

        public void push(int value) {
            if (top == data.length - 1) {
                System.out.println("Stack llena");
                return;
            }
            data[++top] = value;
            System.out.println("Push: " + value);
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack vacía");
                return -1;
            }
            return data[top--];
        }

        public void print() {
            System.out.print("Contenido: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Demostración de Stack");

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.print();

        System.out.println("Pop: " + s.pop());
        s.print();
    }
}