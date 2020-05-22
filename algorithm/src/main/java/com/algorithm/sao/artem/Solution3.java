package com.algorithm.sao.artem;

public class Solution3
{
	public static void main(String[] args)
	{
				System.out.println(new Solution3().findMin(new int[] { 1, 2, 3, 4, 5, 6 }));
				System.out.println(new Solution3().findMin(new int[] {  3, 4, 5, 6, 1, 2}));
				System.out.println(new Solution3().findMin(new int[] { 1, 2, 3, 4, 5, 1 }));
				System.out.println(new Solution3().findMin(new int[] { 1, 2, 3,11, 1 , 1 }));
		System.out.println(new Solution3().findMin(new int[] { 1, 2, 3 }));
		System.out.println(new Solution3().findMin(new int[] { 10, 1, 10, 10, 10 }));
	}



	public int findMin(int[] nums)
	{
		if (nums.length == 1)
			return nums[0];

		if (nums[0] < nums[nums.length - 1])
			return nums[0];

		int min = nums[0], start = 0, end = nums.length - 1;

		return findMinRec(nums, start, end, min);
	}

	public int findMinRec(int[] nums, int start, int end, int min)
	{
		if (end - start <= 1)
			return nums[start] > nums[end] ? nums[end] : nums[start];

		if (nums[(start + end) / 2] == min)
		{
			int f = findMinRec(nums, (start + end) / 2, end, nums[start]);
			if (f != min)
			{
				return findMinRec(nums, (start + end) / 2, end, nums[start]);
			}
			else
			{
				return findMinRec(nums, start, (start + end) / 2, min);
			}
		}

		if (nums[(start + end) / 2] > min)
		{
			return findMinRec(nums, (start + end) / 2, end, nums[start]);
		}
		else
		{
			return findMinRec(nums, start, (start + end) / 2, min);
		}
	}

}
