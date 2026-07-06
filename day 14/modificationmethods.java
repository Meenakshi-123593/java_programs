package day

import java.util.*;
public class modificationmethods {
    public static void main(String args[]) {
//        List<String> list = new ArrayList<>(Arrays.asList("A", "C", "E", "B", "D"));
//        list.set(1, "bb");
//        list.add(2, "b");
//        list.replaceAll((String s) -> s.toUpperCase());
//        Collections.reverse(list);
//        Collections.sort(list);
//        System.out.println(list);
//    }
//}
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        Collections.shuffle(list);
        System.out.println(list);
    }
}