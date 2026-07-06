package day

import java.util.*;
public class C6 {
    public static void main(String args[]) {
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list2.removeIf(n->n% 2 == 0);
        System.out.println(list2);
    }
}