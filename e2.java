package day

import java.util.Scanner;
import java.util.InputMismatchException;
public class e2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int id = 0;
        int[] age = {};

        try {
            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter ID: ");
            id = sc.nextInt();

            System.out.println(age[10]);   // Causes ArrayIndexOutOfBoundsException

        } catch (InputMismatchException e) {
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        } catch (IllegalArgumentException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}