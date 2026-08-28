public class HouseRobber {

    public static int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int previousTwo = nums[0];

        int previousOne = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int current = Math.max(
                previousOne,
                previousTwo + nums[i]
            );

            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        int result = rob(nums);

        System.out.println("Maximum Money: " + result);
    }
}