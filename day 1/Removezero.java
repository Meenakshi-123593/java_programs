package day

import java.util.Scanner;
public class Removezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0, place = 1;
        for (; n != 0; n /= 10) {
            int d = n % 10;
            if (d != 0) {
                result = d * place + result;
                place *= 10;
            }
        }
        System.out.println(result);
    }
}
