import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(Systen.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        calculate(firstNumber, secondNumber, operator);
    }

    public static void calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
            System.out.println("The sum of " + firstNumber + " + " + secondNumber + " = " + result);
        }
        else if (operator == '-') {
            result = firstNumber - secondNumber;
            System.out.println("The difference of " + firstNumber + " - " + secondNumber + " = " + result);
        }
        else if (operator == '*') {
            result = firstNumber * secondNumber;
            System.out.println("The product of " + firstNumber + " * " + secondNumber + " = " + result);
        }
        else if (operator == '/') {
            result = firstNumber / secondNumber;
            System.out.println("The quotient of " + firstNumber + " / " + secondNumber + " = " + result);
        }
        else {
            System.out.println("Error: Invalid operator");
        }
    }
}