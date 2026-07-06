package day//import java.util.*;
//public class c9 {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        List<String> list = new ArrayList<>(Arrays.asList("c","d"));
//        boolean itasA=list.contains(str);
//        System.out.println(itasA);
//    }
//}
import java.util.*;
public class c9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList("c","d"));
        boolean mt=list.isEmpty();
        System.out.println(mt);
        int size=list.size();
        System.out.println(size);
    }
}


