abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
   public void write(){
        System.out.println("Writing wih the pen");
    }

    public void refill(){
        System.out.println("Refilling the pen");
    }
   public void changeNib(){
        System.out.println("Changing he nib of fountain pen");
    }
}
class Monkey{
    void jump(){
        System.out.println("Species can Jump");
    }
    void bite(){
        System.out.println("Species can Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
   public void eat(){
        System.out.println("Human can Eat");
    }
    @Override
    public void sleep(){
        System.out.println("Human can sleep");
    }
}

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartTelephone extends Telephone{
   public void ring(){
       System.out.println("Ringing...");
   }
   public void lift(){
       System.out.println("Call Connected");
   }
   public void disconnect(){
       System.out.println("Call Disconnected");
   }
}
  interface TvRemote{
    public void changeChannel();
  }
  interface SmartTvRemote extends TvRemote{
    public void voiceAssistant();
  }
  class Tv implements SmartTvRemote{
    public void voiceAssistant(){
        System.out.println("Can be operated with your voice");
    }
    public void changeChannel(){
        System.out.println("Can change channel");
    }
  }

public class Practice_11 {
    public static void main(String[] args) {
        FountainPen fountainPen= new FountainPen();
        fountainPen.changeNib();
        fountainPen.write();

        Human human= new Human();
        human.speak();

        Monkey m1= new Monkey();
        m1.bite();
        m1.jump();

        Tv LgTV= new Tv();
        LgTV.changeChannel();
        LgTV.voiceAssistant();

        SmartTelephone iphone= new SmartTelephone();
        iphone.ring();
        iphone.lift();
        iphone.disconnect();


    }
}
