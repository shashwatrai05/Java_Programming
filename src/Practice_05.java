import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {

        //Problem 1- Reverse star pattern
        /*
        for (int i = 1; i <=4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        // Problem 2-Sum of first n even numbers

/*

        System.out.println("Enter number of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum=sum+2*i;
            i++;
        }
        System.out.println(sum);

 */

        // Problem 3-Multiplication table
        /*
        System.out.print("Enter the number you want multiplication table of:-");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n, i, n * i);
       }
        */

        // Problem 4-
        /*
        int n=10;
        for (int i=10;i>0;i--)
            System.out.printf("%d X %d = %d\n", n, i, n * i);

         */

        // Problem 5- Factorial
        /*
        System.out.print("Enter the number you want factorial of:-");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++) {
        fact= fact*i;
        }

        System.out.println(fact);

         */
        // Problem 6- Repeating 5 using while loop
        /*
        System.out.println("Enter number of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("5");
            i++;

         */

        // Problem 7- Repeating 1 using for loop
        /*
            System.out.println("Enter number of terms");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                System.out.println("1");
        }

         */
        // Problem 8- All three loops can be used to do same task
        /*
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("For loop ends here");

        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<5);
        System.out.println("Do-While loop ends here");

        int k=0;
        while(k<5) {
            System.out.println(k);
            k++;
        }
        System.out.println("While loop ends here");

         */

        // Problem 9-Calculating sum of numbers occurring in multiplication table of a number
        /*
        System.out.print("Enter the number you want sum of numbers in multiplication table of:-");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum= sum+i*n;
        }
        System.out.println(sum);

         */

        // Problem 10- A Do-While loop executes at least once
        /*
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

         */

        // Problem 7- Repeating 2 using for loop
        /*
            System.out.println("Enter number of terms");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                System.out.println("2");
        }

         */



    }
}
