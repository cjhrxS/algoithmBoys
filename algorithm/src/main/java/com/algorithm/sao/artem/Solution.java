package com.algorithm.sao.artem;

//first task
public class Solution
{
	public static void main(String[] args)
	{
		System.out.println(new Solution().findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
	}

	public double findMaxAverage(int[] nums, int k)
	{
		int r = k, sum = 0, max = Integer.MIN_VALUE;
		while (r != 0)
		{
			sum += nums[k - r];
			r--;
		}

		for (int i = k; i < nums.length; i++)
		{
			if (sum > max)
			{
				max = sum;
			}
			sum += nums[i];
			sum -= nums[i - k];
		}
		if (sum > max)
		{
			max = sum;
		}

		return max / (double) k;
	}
}
