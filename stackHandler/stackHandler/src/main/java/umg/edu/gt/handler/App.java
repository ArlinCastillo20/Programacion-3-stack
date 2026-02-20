package umg.edu.gt.handler;

import java.util.Scanner;

public class App {

    public static boolean validateExpression(String expression) {
        int count = 0;

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[') {
                count++;
            } else if (c == ')' || c == ']') {
                count--;
            }

            if (count < 0) return false;
        }

        return count == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese expresión:");
        String input = scanner.nextLine();

        boolean result = validateExpression(input);

        System.out.println("Resultado: " + result);
    }
}