package com.algorithm.sao.artem;

import java.util.Arrays;
import java.util.stream.Stream;

//first task
public class Solution
{
	private static final int SEED = 0;

	public double findMaxAverage(int[] nums, int k)
	{
		return Stream.iterate(SEED, i -> i++)
				.limit(nums.length - k)
				.map(i->Arrays.copyOfRange(nums, i, i + k))
				.map(this::arrayAverage)
				.max(Double::compareTo)
				.get();
	}

	private double arrayAverage(int[] nums)
	{
		return Arrays.stream(nums)
				.average()
				.getAsDouble();
	}
}
