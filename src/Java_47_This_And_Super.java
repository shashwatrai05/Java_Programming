class Class1{
        int a;
        public int getA() {
            return a;
        }
        Class1(int a){
            this.a = a;
        }
        public int returnOne(){
            return 1;
        }
    }
    class Class2 extends Class1{ Class2(int c){ super(c);
        System.out.println("I am a constructor"); }
    }
        public class Java_47_This_And_Super {
        public static void main(String[] args) {
            Class1 e = new Class1(65);
            Class2 d = new Class2(5);
            System.out.println(e.getA());
        }
    }

