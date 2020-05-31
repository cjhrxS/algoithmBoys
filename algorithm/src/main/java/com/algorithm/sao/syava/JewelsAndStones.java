package com.algorithm.sao.syava;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] arr = J.toCharArray();
        char[] arr2 = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
