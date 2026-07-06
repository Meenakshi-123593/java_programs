package day

import java.util.Scanner;
public class whileloop5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a key");
        int key=sc.nextInt();
        int count=0;
        while(n!=0){
            int pop=n%10;
            if(pop==key)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }

}
