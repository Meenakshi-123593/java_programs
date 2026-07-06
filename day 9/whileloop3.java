package day

import java.util.Scanner;
public class whileloop3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int pop=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
