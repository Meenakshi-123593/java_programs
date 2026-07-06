import java.util.Scanner;
public class array3 {
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,3,4,5};
        int sum=0;
        for(int i=0;i<=5;i++)
        {
            sum=sum+i;
        }
        float avg=sum/5;
        System.out.println(avg);
    }
}
