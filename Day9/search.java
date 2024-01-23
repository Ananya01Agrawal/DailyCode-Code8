import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        Scanner scanner = new Scanner(System.in);
        int numToFind = scanner.nextInt();

        int index = -1; // Initialize index to -1

        // Iterate through the array to find the element
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == numToFind) {
                index = i; // Element found, update index
                break;     // No need to continue searching
            }
        }

        // Print the result
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
