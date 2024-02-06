import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the median of the row-wise sorted array
        double median = findMedian(matrix);

        // Output the median
        System.out.println("Median of the row-wise sorted array: " + median);

        scanner.close();
    }

    public static double findMedian(int[][] matrix) {
        int totalElements = matrix.length * matrix[0].length;
        int targetIndex = totalElements / 2;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the matrix
        for (int[] row : matrix) {
            min = Math.min(min, row[0]);
            max = Math.max(max, row[row.length - 1]);
        }

        // Binary search to find the median
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0;

            // Count the number of elements less than or equal to mid
            for (int[] row : matrix) {
                count += binarySearch(row, mid);
            }

            // Adjust min or max based on the count
            if (count <= targetIndex) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
