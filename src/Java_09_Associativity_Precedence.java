public class Java_09_Associativity_Precedence {
    public static void main(String[] args) {

        //Precedence & Associativity

            int A = 6*5-34/2;
        System.out.println(A);
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
            int B= 60/5-34*2;
        System.out.println(B);
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //Quick Quiz
         //1
            int x =6;
            int y = 5;
            int z = x - y/2;
        System.out.println(z);

        //2
            int a = 4;
            int b = 5;
            int c = 10;
            int k = b*b - (4*a*c)/(2*a);
            System.out.println(k);

            //3
            int v=5;
            int u=4;
            int w=v*v-u*u;
        System.out.println(w);


        }
    }
