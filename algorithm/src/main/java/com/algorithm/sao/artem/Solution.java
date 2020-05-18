package com.algorithm.sao.artem;

import java.util.stream.Stream;

//first task
public class Solution
{
	private static final int SEED = 0;

	public double findMaxAverage(int[] nums, int k)
	{
		return Stream.iterate(SEED, i -> i = i + 1)
				.limit(nums.length - k)
				.map(integer -> this.sum(nums, integer, integer + k + 1))
				.max(Integer::compareTo)
				.get() / (double) k;

	}

	private int sum(int[] nums, int from, int to)
	{
		int sum = 0;
		for (int i = from; i < to; i++)
		{
			sum += nums[i];
		}
		return sum;
	}
}
