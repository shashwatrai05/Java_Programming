import java.util.Scanner;
import java.util.Arrays;

public class Test {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int sum = 0;

     while (true) {
         System.out.print("Enter a number (or 'x' to exit): ");
         String userInput = sc.next();

         if (userInput.equals("x")) {
             break;
         }
         int num= Integer.parseInt(userInput);
             sum += num;

     }

     System.out.println("Sum of all entered numbers: " + sum);

        }
    }
