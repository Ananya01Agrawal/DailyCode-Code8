public class Main {
    public static void main(String[] args) {
        // find the number that appears only once in the array and other number twice   
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int result = 0; 
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println(result);
    }
}
