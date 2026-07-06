package day

import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int s=num*num;
        int r=num;
        for(;r>0;r=r/10,s=s/10)
        {
            if(r%10!=s%10)
            {
                System.out.println("Not Automorphic number");
            }
            else {
                System.out.println("Automorphic number");
            }
        }

    }
}
