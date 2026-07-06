package day3;
import java.util.Scanner;
public class fn1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int a=sum(num1,num2);
        System.out.println(a);
    }
    static int sum(int a,int b){
        int add=a+b;
        return add;
    }
}
