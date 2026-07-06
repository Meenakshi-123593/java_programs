package day

import java.util.*;
public class c8 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        String n = list.get(0);
        System.out.println(n);
        int n2=list.indexOf("A");
        System.out.println(n2);
    }
}

