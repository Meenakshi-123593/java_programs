import java.util.Scanner;
public class Array1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[] arr=new String[6];
        {
            for (int i = 0; i < 6; i++) {
                arr[i] = s.next();
            }
            for (int i = 0; i < 6; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}
