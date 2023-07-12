import java.util.Scanner;

public class Java_18_Switch_Case {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age:-");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();


        switch (age) {
            case 5 -> System.out.println("You are infant");
            case 12 -> System.out.println("You are a kid");
            case 18 -> System.out.println("You are a teenager");
            case 45 -> System.out.println("You are an adult");
            case 60 -> System.out.println("You are old");
            default -> System.out.println("Your age is not listed");
        }
    }
}