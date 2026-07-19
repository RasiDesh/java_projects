// Simple calculator program in Java

import java.util.Scanner;

public class calculator 
{

    // Arithmetic methods

    // Addition
    public static float add(float num1, float num2) 
    {
        return num1 + num2;
    }

    // Subtraction
    public static float subtract(float num1, float num2) 
    {
        if (num1 < num2) 
        {
            System.out.println("Result is negative, returning absolute value.");
            return num2 - num1;
        } 
        else 
        {
            return num1 - num2;
        }
    }

    // Multiplication
    public static float multiply(float num1, float num2) 
    {
        return num1 * num2;
    }

    // Division
    public static float divide(float num1, float num2) 
    {
        if (num2 == 0) 
        {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return num1 / num2;
    }

    // Modulo/Remainder
    public static float modulo(float num1, float num2) 
    {
        if (num2 == 0) 
        {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return num1 % num2;
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            // Menu
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("A - Add");
            System.out.println("S - Subtract");
            System.out.println("M - Multiply");
            System.out.println("D - Divide");
            System.out.println("R - Modulo");
            System.out.println("E - Exit");
            System.out.print("Choose an option: ");

            char operation = scanner.next().charAt(0);
            operation = Character.toUpperCase(operation);

            if (operation == 'E') 
            {
                System.out.println("Exiting calculator. Goodbye!");
                break; 
            }

            System.out.print("Enter first number: ");
            float num1 = scanner.nextFloat();

            System.out.print("Enter second number: ");
            float num2 = scanner.nextFloat();

            float result = 0;

            switch (operation) 
            {
                case 'A':
                    result = add(num1, num2);
                    break;
                case 'S':
                    result = subtract(num1, num2);
                    break;
                case 'M':
                    result = multiply(num1, num2);
                    break;
                case 'D':
                    result = divide(num1, num2);
                    break;
                case 'R':
                    result = modulo(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation! Try again.");
                    continue; 
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
