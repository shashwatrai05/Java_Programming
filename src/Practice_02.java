import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        // Problem 1- Result of given expression
        /*
        float a=7/2f*9/2f;
        System.out.println(a);

         */

        // Problem 2- Encrypting and Decrypting a grade
        /*
        char grade='A';
        grade= (char)(grade+8);
        System.out.println(grade);
        grade=(char)(grade-8);
        System.out.println(grade);

         */

        // Problem 3- Comparing user entered number with given number
        /*
        int num=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a>num) {
            System.out.println("Entered number is greater than given number");
        }
        else{
            System.out.println("Entered number is smaller than given number");
        }

         */

        // Problem 4- Writing an expression
        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of v");
        int v=sc.nextInt();

        System.out.println("Enter the value of u");
        int u=sc.nextInt();

        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of s");
        int s=sc.nextInt();

        double x=(v*v-u*u)/(2*a*s);
        System.out.println(x);

         */

        // Problem 5- Finding value of expression
        int a=7*49/7 + 35/7;
        System.out.println(a);
    }
}
