package com.algorithm.sao.syava;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMaximum(candies);
        List<Boolean> ls = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            ls.add((candies[i] + extraCandies) >= max);
        }

        return ls;

    }

    private static int findMaximum(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
}
