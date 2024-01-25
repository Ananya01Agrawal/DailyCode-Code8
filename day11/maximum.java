public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(array);
        System.out.println(maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
