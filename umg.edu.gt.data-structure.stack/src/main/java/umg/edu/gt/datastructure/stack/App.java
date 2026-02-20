package umg.edu.gt.datastructure.stack;

public class App {
    public static void main(String[] args) {

        String test1 = "{[()]}";
        String test2 = "{[(])}";

        System.out.println("Prueba 1: " + test1);
        System.out.println("Es válida? " + SymbolValidator.isValid(test1));

        System.out.println("Prueba 2: " + test2);
        System.out.println("Es válida? " + SymbolValidator.isValid(test2));
    }
}