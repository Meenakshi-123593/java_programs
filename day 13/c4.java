package day

import java.util.*;
public class c4 {
       public static void main(String args[]){
           List<String> list = new ArrayList<>();
           list.add("aa");
           list.add("dd");
           list.remove(1);
           list.addFirst("orange");
           list.add(1,"three");
           List<String> name=Arrays.asList("nnn","aaaaaa");
           list.addAll(0,name);
           System.out.println(list);
       }
}
