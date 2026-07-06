public class array4 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 4; i++) {
            while (arr[i] > max) {
                max = arr[i];
            }
            while (arr[i] < min) {
                min=arr[i];
            }
        }
            System.out.println(max);
            System.out.println(min);
    }
}




