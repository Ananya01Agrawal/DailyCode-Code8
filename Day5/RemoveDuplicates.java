import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Remove Duplicates in-place from the sorted array  
        // Meaning of in-place is that you cannot use extra space
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 8, 9, 9};
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n - 1];
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }   
    }
}
//time complexity: O(n)
//space complexity: O(1)
