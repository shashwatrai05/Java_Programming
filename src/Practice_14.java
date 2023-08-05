import java.util.Scanner;

class CustomException extends Exception{
    @Override
    public String getMessage() {
        return "This is a Custom error";
    }
}

public class Practice_14 {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        /*
        int a = 0 // Error: no semicolon!
         b = 8; // Error: b not declared!
        */

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 and 10
        /*
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }
         */

        // RUNTIME ERROR
        /*
        int [] arr={5,8,3};
        System.out.println(arr[3]);
         */
        /*
        int [] marks = {7,5,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
        */


        int [] arr={5,8,3,6,9};
        for (int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index of array you want to excess");
            int index = sc.nextInt();
            try {
                System.out.println(arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Try Again!");
            }
        }

            try{
                throw new CustomException();
            }
            catch(CustomException e){
                System.out.println("\n"+e.getMessage());
            }
       // System.out.println("Error");

    }
}
