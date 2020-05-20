package com.algorithm.sao.artem;

public class Solution2
{

	public static void main(String[] args)
	{
		System.out.println(new Solution2().numEquivDominoPairs(new int[][] { {1,2},{2,1},{3,4},{5,6}}));
	}

	public int numEquivDominoPairs(int[][] dominoes) {
		int count = 0, un= 0, p=0;
		int[][] unique = new int[100][3];

		for (int i = 0; i < dominoes.length; i++)
		{
			p = getPositionOfElementInUniqueArray(unique, dominoes[i][0], dominoes[i][1], un);
			if(p == -1){
				unique[un][0] = dominoes[i][0];
				unique[un][1] = dominoes[i][1];
				un++;
			}else
			{
				count += unique[p][2] - 1;
				count++;
			}
		}
		return count;
	}

	private int getPositionOfElementInUniqueArray(int[][] unique, int first, int second, int length)
	{
		for (int i = 0; i < length; i++)
		{
			if (unique[i][0] == first && unique[i][1] ==second || unique[i][1] == first && unique[i][0] ==second)
			{
				unique[i][2]++;
				return i;
			}
		}
		return -1;
	}
}

