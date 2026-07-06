package day4;

public class vowelsandconsonant{
    public static void main(String[] args) {
        String str="hEllo";
        String Strg=str.toLowerCase();
        int count=0;
        char[] ch=Strg.toCharArray();
        for(char num:ch){
            if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u'){
                count++;
            }

        }
        System.out.println("number of vowels:"+count);
    }
}
