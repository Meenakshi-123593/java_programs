package day

class A {
        String name="karthick";
        void display()
        {

            System.out.println("Hello world");
        }
    }

    class B extends A {
        void display() {
            System.out.println("hello karthick");
            System.out.println(super.name);
        }
    }
    public class superkeyword{
        public static void main(String[] args){
            A B=new B();
            B.display();
        }
    }


