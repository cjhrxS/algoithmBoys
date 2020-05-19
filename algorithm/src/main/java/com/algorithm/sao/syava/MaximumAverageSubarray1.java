package com.algorithm.sao.syava;

public class MaximumAverageSubarray1 {


    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            if (max < sum) {
                max = sum;
            }
            sum += nums[i];
            sum -= nums[i - k];
        }
        if (max < sum) {
            max = sum;
        }
        return (double) max / k;
    }
}
