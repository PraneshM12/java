import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] arr) {
        int insertPos = 0;

        // Step 1: Move all non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos++] = num;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("After moving zeros: " + Arrays.toString(nums)); // [1, 3, 12, 0, 0]
    }
}