import java.util.Arrays;

public class ProductArray {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        // Step 1: Calculate prefix products
        int prefix = 1;

        for (int i = 0; i < n; i++) {

            result[i] = prefix;

            prefix = prefix * nums[i];
        }

        // Step 2: Calculate suffix products
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * suffix;

            suffix = suffix * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}