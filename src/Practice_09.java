class Cylinder{
   private int radius;
    private int height;
    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){

        this.height = h;
    }
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }

    public Cylinder(){
        radius=4;
        height=8;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius;
    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }


    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        return 4*Math.PI * radius * radius * radius/3;
    }
    public Sphere(){
        radius=4;
    }
}

public class Practice_09 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        //Problem 1
        /*
        cyl.setRadius(5);
        System.out.println(cyl.getRadius());
        cyl.setHeight(10);
        System.out.println(cyl.getHeight());

         */
        // Problem 2
        /*
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());
         */
        //Problem 3
        /*
        System.out.println(cyl.getHeight());
        System.out.println(cyl.getRadius());

         */

        //Problem 4
        /*
        Rectangle1 rec=new Rectangle1(6,7);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());

         */

        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());

        System.out.println(cyl.getRadius());
    }

}
