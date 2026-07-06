package day

import java.util.Scanner;
public class whileloop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0)
        {
            int pop = n % 10;
            sum = sum + pop;
            n = n / 10;
        }
    }
}