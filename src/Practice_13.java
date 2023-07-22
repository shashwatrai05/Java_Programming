class MyThread3 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("Good Morning ");
            i++;
        }
    }
}

class MyThread4 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Practice_13 {
    public static void main(String[] args) {
        MyThread3 t3=new MyThread3();
        MyThread4 t4= new MyThread4();
       // t3.start();
        //t4.start();
        t3.setPriority(6);
        t4.setPriority(9);
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t4.getState());
        System.out.println(t3.getState());
        System.out.println(Thread.currentThread().getState());
    }

}
