package src.javacodes.arrays;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            num[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            num[nums1.length + i] = nums2[i];
        }
        Arrays.sort(num);
        if (num.length % 2 != 0) {
            return num[(num.length / 2)];
        } else {
            double n = ((double) num[num.length / 2] + (double) num[(num.length / 2) - 1]) / 2;
            return n;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 6 };
        int arr2[] = { 2, 3, 6, 7, 8 };

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
