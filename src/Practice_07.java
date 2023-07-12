
import java.util.Scanner;
public class Practice_07 {

    // Problem 1- Multiplication table

    static int Multiplication_Table(int x) {
        for (int i=0;i<=10;i++) {
            System.out.printf("%d X %d = %d\n", x, i, x * i);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number you want multiplication table of:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        {
           int c= Multiplication_Table(a);
           }
       }



    // Problem 2- Star Pattern
    /*
     static void Star_Pattern(int n){
         for (int i=0;i<n;i++){
             for (int j=0;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println(" ");
         }
     }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Star_Pattern(a);
    }

     */

    // Problem 3- Sum of first n natural numbers
/*
    static int sum(int n) {

        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of numbers you want sum of");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum(a));
       }

 */

    // Problem 4- Reverse Star Pattern
    /*
    static void Reverse_Star_Pattern(int n){
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Reverse_Star_Pattern(a);
    }

     */

    // Problem 5- Finding nth term of Fibonacci series
    /*
    static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
           return fibonacci(n-2)+fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the term you want to know");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("The value of fibonacci number at position no %d is %d",fibonacci(a));
    }

     */

    // Problem 6- Finding average of numbers
    /*
    static int avg(int ...arr){
        int result = 0;
        for (int a : arr){
            result = (result + a) ;
        }
        result= result/arr.length;
        return result;
    }
    public static void main(String[] args){

        System.out.println(avg(57,79));
        System.out.println(avg(83,87,98));
        System.out.println(avg(84,75,96,93));
    }

     */

    // Problem 9- Converting celsius to fahrenheit
    /*
    static void temperature(int c){
       float f = (9*c)/5f + 32;
        System.out.println(f);
    }

    public static void main(String[] args) {
        System.out.println("Enter temperature in celsius");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        temperature(a);

    }

     */

    // Problem 10- Repeating 3 using iterative approach
    /*
    static void repetition_iterative(int n){

            for (int i=1;i<=n;i++){
                System.out.println("3");
            }
        }

    public static void main(String[] args) {
        System.out.println("Enter the no. of time you want to repeat 3");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        repetition_iterative(a);
        }

     */


}

