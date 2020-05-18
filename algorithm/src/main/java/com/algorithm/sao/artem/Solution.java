package com.algorithm.sao.artem;

import java.util.stream.Stream;

//first task
public class Solution
{
	public double findMaxAverage(int[] nums, int k)
	{
		int sum, max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - k+1; i++)
		{
			sum = 0;
			for (int j = i; j < i + k; j++) {
				sum+=nums[j];
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max/(double)k;
	}
}
