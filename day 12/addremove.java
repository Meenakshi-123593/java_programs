package day

import java.util.*;
public class addremove {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove(0);
        list.addFirst("d");
        System.out.println(list);
    }
}
