
class Employees {
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My salary is " + salary);
    }
    public int getSalary(){

        return salary;
    }

    public String getName(){

        return name;
    }

    public String setName(){

        return name;
    }
}

class Cellphone {
    static void ringing() {
        System.out.println("Ringing....");
    }

    static void vibrating() {
        System.out.println("Vibrating....");
    }
}

class Square {
    int side;
    public int area() {
        return side * side;
    }
        public int perimeter(){
            return 4*side;
        }

    }

    class Rectangle {
    public void repeat () {

            for ( int i = 0; i < 5; i++) {
                for (int j = 0; j < 15;j++) {
                    System.out.print("3 ");
                }
                System.out.print("\n");
            }}}

        class Tommy{
    public void hit() {
        System.out.println("Hitting");
    }
        public void fire(){
            System.out.println("Firing");}
            public void run(){
                System.out.println("Running");

    }
        }
class Circle {
    static void printPattern(int radius) {

        // dist represents distance to the center
        double dist;

        // for horizontal movement
        for (int i = 0; i <= 2 * radius; i++) {

            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\n");
        }
    }
}

    public class Practice_08 {
        public static void main(String[] args) {
            //Problem-1
            /*
            Employees shashwat = new Employees();
            Employees sakshi = new Employees();
            Employees shikhar = new Employees();

            shashwat.salary = 34;
            shashwat.name = "Shashwat Rai";

            sakshi.salary = 12;
            sakshi.name = "Sakshi Rai";

            shikhar.salary = 712479324;
            shikhar.name = "Shikhar Bhardwaj";

            shashwat.printDetails();
            sakshi.printDetails();
            shikhar.printDetails();

            shashwat.getName();
            System.out.println("Shashwat");

            int salary1 = shashwat.getSalary();
            System.out.println("Shashwat's salary is " + salary1);

            sakshi.getName();
            System.out.println("Sakshi ");

            int salary2 = sakshi.getSalary();
            System.out.println("Sakshi's salary is " + salary2);

            shashwat.setName();
            System.out.println("Shikhar");

            int salary3 = shikhar.getSalary();
            System.out.println("Shikhar's salary is " + salary3);

 */
            //Problem-2
            /*
            Cellphone asus= new Cellphone();
            asus.vibrating();
            asus.ringing();

            */
            //Problem-3
            /*
            Square sq=new Square();
            sq.side=7;
            System.out.println("Area of square is"+ sq.area());
            System.out.println("Perimeter of square is"+ sq.perimeter());

             */
            //Problem-4
/*
            Rectangle r=new Rectangle();
            r.repeat();
*/
             /*
        // Problem-5
            Tommy Rockstar=new Tommy();
            Rockstar.hit();
            Rockstar.run();
            Rockstar.fire();

              */
            // Problem-6
            Circle c=new Circle();
            int radius = 2;
            c.printPattern(radius);
        }
    }
