package day

import java.util.Scanner;
public class csejava2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int P=sc.nextInt();
        System.out.println("Enter second number");
        int N=sc.nextInt();
        System.out.println("Enter third number");
        int R=sc.nextInt();
        int SI=(P*N*R)/100;
        System.out.println("Simple interest"+SI);
    }

}
