package day

class bankbalance {
    private int a;

    public int getA(int a){
        return a;
    }
    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("invalid input");
        }
    }
        void display() {
            System.out.println("Bank balance" + a);
        }
    }
        public class oops2{
            public static void main(String[] args){
                bankbalance a1=new bankbalance();
                a1.setA(20000);
                a1.display();
    }
}
