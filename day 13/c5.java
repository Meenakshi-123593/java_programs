package day

import java.util.*;
public class c5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
list.remove(0);
list.remove("B");
List<String> names=Arrays.asList("A","B");
list.removeAll(names);
System.out.println(list);
    }
}