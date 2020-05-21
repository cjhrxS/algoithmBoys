package com.algorithm.sao.syava;

public class NumberOfEquivalentDominoPairs {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int pointer = 0;
        int[][] additionalArr = new int[50][3];
        for (int i = 0; i < dominoes.length; i++) {
            int js = isArrayContainsDomino(additionalArr, dominoes[i][0], dominoes[i][1]);
            if (js == -1) {
                additionalArr[pointer][0] = dominoes[i][0];
                additionalArr[pointer][1] = dominoes[i][1];
                pointer++;
            } else{
                count += additionalArr[js][2];
            }
        }
        return count;

    }

    public static int isArrayContainsDomino(int[][] dominoes, int i1, int i2){
        for (int i = 0; i < dominoes.length; i++) {
            if((dominoes[i][0] == i1 && dominoes[i][1] == i2) || (dominoes[i][0] == i2 && dominoes[i][1] == i1)){
                dominoes[i][2]++;
                return i;
            }
        }
        return -1;
    }
}
