import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // Given array
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        // Initialize variables to track maximum sum
        int max_so_far = arr[0];         // Overall maximum sum
        int max_ending_here = 0;         // Maximum sum ending at the current index

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the running sum
            max_ending_here += arr[i];

            // Update overall maximum if the running sum becomes greater
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

            // If the running sum becomes negative, reset it to 0
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        // Print the maximum subarray sum
        System.out.println(max_so_far);
    }
}
