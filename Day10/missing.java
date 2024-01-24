public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 4, 6, 3, 7, 8};
        int result = findMissingNumber(inputArray);
        System.out.println(result);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // One number is missing, so we add 1 to the length

        // Calculate the expected sum if no number is missing using the formula n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the given array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The difference between the expected sum and actual sum is the missing number
        return expectedSum - actualSum;
    }
}
