package src.javacodes.arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                len++;
            }
        }
        int[] arr1 = new int[len];

        int j = 0, k = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                arr1[k] = nums[j];
                k++;
            }
            j++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < arr1.length) {
                nums[i] = arr1[i];
            } else {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
    }
}