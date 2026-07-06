package day;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=sc.nextInt();
        System.out.println(rev);
    }
    static int rev(int n){
        int rev=0;
       while(n!=0)
       {
           int pop=n%10;
           rev=rev*10+pop;
           n=n/10;
       }
       return rev;
    }
}
