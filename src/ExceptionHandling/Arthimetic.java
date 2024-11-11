package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arthimetic {
    public static void main(String[] args) {
        //ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. " + e.getMessage());
        }

        //ArrayIndexOutOfBound
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]);  // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }

        //NullPointerException
        String text = null;
        try {
            System.out.println(text.length());  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot perform operation on a null object. " + e.getMessage());
        }

        //FileNotFoundException
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);  // This will cause FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        //NumberFormatException
        String str = "abc";
        try {
            int number = Integer.parseInt(str);  // This will cause NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }

    }
}

