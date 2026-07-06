package day

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        while (n != 0) {
            if (n % 10 == t) count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
