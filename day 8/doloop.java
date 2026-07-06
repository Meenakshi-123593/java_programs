package day

import java.util.Random;
import java.util.Scanner;
public class doloop {
    public static void main(String[] args)
    {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int key=rand.nextInt(bound 100);
        int guess;
        do{
            System.out.println("Enter a number");
            guess=sc.nextInt();
            if(guess>key)
            {
                System.out.println(guess+"is too high");
            }
            else if(guess<key)
            {
                System.out.println(guess+"is too low");
            }
        }

    }
}
