package day

import java.util.*;
public class allmixedprog {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("E", "B", "C","F"));
        list.add("A");
        list.remove(1);
        list.addFirst("orange");
        list.add(1,"three");
        List<String> name=Arrays.asList("Ann","Zero");
        list.addAll(0,name);
        String n = list.get(0);
        boolean mt=list.isEmpty();
        int size=list.size();
        System.out.println(size);
        System.out.println(list);
        System.out.println(mt);
    }

}
