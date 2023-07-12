import java.util.Scanner;

public class Practice_04 {
    public static void main(String[] args) {


        //Problem 1-If-Else output
        /*
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a==11){
            System.out.println("I'm 11");
        }
        else {
            System.out.println("I'm not 11");
        }

         */


        //Problem 2- Checking whether a student is Pass or Fail
        /*
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of first subject\n");
        int a=sc.nextInt();

        System.out.println("Enter the marks of second subject\n");
        int b=sc.nextInt();

        System.out.println("Enter the marks of third subject\n");
        int c=sc.nextInt();

         int sum=a+b+c;
        System.out.printf("Total marks in %d\n",sum);

        int percentage=sum/3;
        System.out.printf("Total Percentage is %d\n", percentage);

        if (a>33 && b>33 && c>33 && percentage>40)
        {
            System.out.println("Your passed the exam");
        }
        else {
            System.out.println("You are fail");
        }

         */


        // Problem 3- Calculating income tax
        /*
        Scanner sc=new Scanner(System.in);
        double tax=0;

        System.out.println("Enter your income");
        double income=sc.nextDouble();

        if (income<=250000)
        {
            tax= tax + 0;
        }
        else if (income>250000 && income<500000)
        {
            tax= tax + 0.05 * income;
        }
       else if (income>500000 && income<1000000)
        {
            tax=tax + 0.2*income ;
        }
        else
        {
            tax = tax + 0.3 * income;
        }
        System.out.println(tax);

         */

        //Problem 4- Finding out the day of the week
        /*
        int days;
        System.out.println("Enter the number from 1 to 7");
        Scanner sc= new Scanner(System.in);
        days=sc.nextInt();


        switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

         */

        // Problem 5- Leap Year
        /*
        int year;
        System.out.println("Enter the Year you want to know about");
        Scanner sc= new Scanner(System.in);
        year=sc.nextInt();

        if(year%400==0)
        {
            System.out.println("It's a leap year");
        }
        else if(year%100==0)
        {
            System.out.println("It's not a leap year");
        }

        else if(year%4==0)
        {
            System.out.println("It's a leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }

         */
// Problem 6- Finding out type of website from url
        System.out.println("Enter the website url");
        Scanner sc= new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("It is an Organisational website");
        }
        else if(website.endsWith(".com")) {
            System.out.println("It is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an Indian website");
        }

    }

}
