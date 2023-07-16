class Circle1{
    public int radius;
    Circle1(){
        System.out.println("Non parameterized Circle Constructor");
    }
    Circle1(int r){
        System.out.println("Parameterized Constructor");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

        }

        class Rectangle2{
        int length;
        int breadth;
            Rectangle2(){
                System.out.println("Non parameterized Circle Constructor");
            }
            Rectangle2(int l,int b){
                System.out.println("Parameterized Constructor");
            }
            public double area(){
                return this.length*this.breadth;
            }
        }
        class Cuboid extends Rectangle2{
            public int height;
            Cuboid(int l, int b, int h){
                super(l,b);
                System.out.println("I am Cuboid parameterized constructor");
                this.height = h;
            }
            public double volume(){
                return this.length*this.breadth*this.height;
            }

        }

public class Practice_10 {
    public static void main(String[] args) {
        Cylinder1 cyl=new Cylinder1(4,5);
        cyl.height=5;
        cyl.radius=4;
        System.out.println(cyl.volume());

        Cuboid cub= new Cuboid(5,6,4);
        cub.length=5;
        cub.breadth=4;
        cub.height=3;
        System.out.println(cub.volume());
    }
}
