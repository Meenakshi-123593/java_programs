package day

import java.util.Scanner;
class add1 {
    int a;
    int b;
    public void add() {
        int add = a + b;
        System.out.println("a+b = " + add);
    }
}
public class opps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add1 A = new add1();
        A.a = sc.nextInt();
        A.b = sc.nextInt();
        A.add();
    }
}