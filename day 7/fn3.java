package day;
import java.util.Scanner;
public class fn3 {
    public static void main(String[] args)
    {
        sum();
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int add=n1+n2;
        System.out.println(add);
    }
}
