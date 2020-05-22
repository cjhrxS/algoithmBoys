package com.algorithm.sao.artem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution4
{
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = Arrays.stream(candies).max().getAsInt();
		return Arrays.stream(candies).mapToObj(candi -> candi+extraCandies>=max).collect(Collectors.toList());
	}
}
