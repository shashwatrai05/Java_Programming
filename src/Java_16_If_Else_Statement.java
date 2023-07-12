import java.util.Scanner;
public class Java_16_If_Else_Statement {
    public static void main(String[] args) {
     /*
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
if (a>18) {
        System.out.println("You can drive");
    }
else{
        System.out.println("You are underage!");
    }
 */
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }




}
}
