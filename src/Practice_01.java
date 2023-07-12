import java.util.Scanner;

public class Practice_01 {

        public static void main(String[] args) {
        // Problem 1- Sum of three numbers
            /*
            int a=4;
            int b=7;
            int c=9;
            int sum=a+b+c;
            System.out.println(sum);

         */
          // Problem 2- Calculating CGPA
/*
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter marks of first subject");
            int a = sc.nextInt();

            System.out.println("Enter marks of second subject");
            int b = sc.nextInt();

            System.out.println("Enter marks of third subject");
            int c = sc.nextInt();



            int sum=a+b+c;
            float cgpa=sum*10/300f;
            System.out.println("CGPA is:");
            System.out.println(cgpa);
            */

            // Problem 3- Greeting user
            /*
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Name");
            String str = sc.nextLine();

            System.out.print("Hello ");
            System.out.print(str);
            System.out.println(",have a nice day");
*/

            // Problem 4- Converting km to miles
            /*
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter distance in Km");
            double km = sc.nextDouble();
            double miles= km * 0.621372;
            System.out.println(miles);
             */

            // Problem 5- Checking a number is Integer or not
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            System.out.println(sc.hasNextInt());


        }

    }

