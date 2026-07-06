package day4;

public class stringreverse {
    public static void main(String[] args){
        String name="hello world";
        char[] s=name.toCharArray();
        int start=0;
        int end=s.length-1;
        while(start<end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        }
        String name1=new String(s);
        System.out.println(name1);
    }

}
