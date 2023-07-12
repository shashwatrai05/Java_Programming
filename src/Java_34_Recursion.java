import java.util.Scanner;
public class Java_34_Recursion {

        // factorial(n) = n * factorial(n-1)

        static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                return n * factorial(n-1);
            }
        }
       /*
        static int factorial_iterative(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;
                for (int i=1;i<=n;i++){ // 1 to n
                    product *= i;
                }
                return product;
            }
        }

        */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to find factorial");
            int a = sc.nextInt();

            System.out.println("The value of factorial " + a + " is:" + factorial(a));
            //System.out.println("The value of factorial x is: " + factorial_iterative(x));
        }
    }


