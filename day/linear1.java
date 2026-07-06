public class linear1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int key=4;
        int index=-1;
        for(int num:arr){
            if(num==key){
                index=num;
            }
        }
        if(index==-1){
            System.out.println("not fpund");
        }
        else{
            System.out.println("found");
        }
    }
}
