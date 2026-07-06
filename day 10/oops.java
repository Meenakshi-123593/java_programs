package day

class calculator {
    int a;
    int b;

    public calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add() {
        int add=a+b;
        System.out.println("a+b:"+ add);
    }
}
public class oops{
    public static void main(String[] args){
        calculator A=new calculator(10,20);
        A.add();
    }
}
