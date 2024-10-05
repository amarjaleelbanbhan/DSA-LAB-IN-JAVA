import java.util.Arrays;
import java.util.Scanner;

public class Sum {

    public static boolean TwoSum(int[] nums, int target) {
        
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> nums[a] - nums[b]);

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[indices[left]] + nums[indices[right]];

            if (sum == target) {
                System.out.println("Target found at indices " + indices[left] + " and " + indices[right]);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int target = s1.nextInt();
        int[] nums = {8, 4, 1, 6};
        System.out.println(TwoSum(nums, target));
    }
}
