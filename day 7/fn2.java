package day;
import java.util.Scanner;
public class fn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sum(n1, n2);
    }
         static void sum(int n1,int n2)
        {
            int add=n1+n2;
            System.out.println(add);
        }
    }

