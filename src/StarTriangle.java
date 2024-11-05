import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer rows = scanner.nextInt();
            

            for (Integer i = 1; i <= rows; i++) {
                for (Integer j = i; j < rows; j++) {
                    System.out.print(" ");
                }

                for (Integer k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            System.out.println(); 
        }

    }
}

