package day

import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n * n;
        int sum = 0;
        for (; s != 0; s /= 10)
            sum += s % 10;
        if (sum == n) {
            System.out.println("Neon");
        } else {
            System.out.println("Not Neon");
        }
    }
}
