package day

import java.util.Scanner;
public class cseaclass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();  
        int a1=(c%10);
        int b1=(b%10);
        int c1=(a%10);
        int u=((a1*100)+(b1*10)+(c1*1));
        System.out.println("Reverse number"+u);
    }
}
