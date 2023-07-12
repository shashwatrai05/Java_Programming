import java.util.Scanner;

public class Exercise_01_Percentage_Calculator {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of student");
        String str = sc.nextLine();
        System.out.println("Enter marks of first subject");
        int a = sc.nextInt();

        System.out.println("Enter marks of second subject");
        int b = sc.nextInt();

        System.out.println("Enter marks of third subject");
        int c = sc.nextInt();

        System.out.println("Enter marks of fourth subject");
        int d = sc.nextInt();

        System.out.println("Enter marks of fifth subject");
        int e = sc.nextInt();

        int sum=a+b+c+d+e;
        int percentage=sum*100/500;
        System.out.println("Percentage is:");
        System.out.println(percentage);
    }

}
