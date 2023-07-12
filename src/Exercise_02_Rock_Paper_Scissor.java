import java.util.Scanner;
import java.util.Random;

public class Exercise_02_Rock_Paper_Scissor {
    public static void main(String[] args) {
int i;
        int computerscore=0;
        int yourscore=0;
for (i=0;i<5;i++) {
    System.out.println("Type 0 for Rock, 1 for paper and 2 for scissors");
    System.out.println("Enter your choice");
    int choice;
    Scanner sc = new Scanner(System.in);
   choice = sc.nextInt();
    System.out.println("Computer's choice");
    Random r = new Random();
    int a = r.nextInt(2);
    System.out.println(a);

    if (choice == 0 && a == 1) {
        System.out.println("Computer wins");
        computerscore=computerscore + 1;
    } else if (choice == 1 && a == 0) {
        System.out.println("You win");
        yourscore=yourscore+1;
    } else if (choice == 0 && a == 2) {
        System.out.println("You wins");
        yourscore=yourscore+1;
    } else if (choice == 2 && a == 0) {
        System.out.println("Computer wins");
        computerscore=computerscore + 1;
    } else if (choice == 2 && a == 1) {
        System.out.println("You win");
        yourscore=yourscore+1;
    } else if (choice == 1 && a == 2) {
        System.out.println("Computer wins");
        computerscore=computerscore + 1;
    }
    else {
        System.out.println("Its a tie");
    }
}
if (yourscore>computerscore)
{
    System.out.println("You win the game");

}
else {
    System.out.println("Computer win the game");
}

    }
}
