package day

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0&&n <= 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}