package day4;

import java.util.*;
public class longestword {
         public static void main(String[] args){
             String str="Iam good";
             String[] arr=str.split(" ");
             String longest=arr[0];
             for(String strs:arr){
                 if(strs.length()>longest.length()) {
                     longest=strs;
                 }
             }
             System.out.println(longest);
         }
}
