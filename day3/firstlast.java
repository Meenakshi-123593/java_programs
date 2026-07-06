package day3;

import java.util.Scanner;
public class firstlast {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last = n % 10;
        int first = n;
        for (; first >= 10; first /= 10);
        System.out.println(first + last);
    }
}
