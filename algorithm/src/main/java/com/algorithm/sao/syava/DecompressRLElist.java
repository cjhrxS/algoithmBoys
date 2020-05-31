package com.algorithm.sao.syava;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int[] arr;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i+=2){
            int freq = nums[i];
            int val = nums[i + 1];

            for(int j = 0; j < freq; j++){
                ls.add(val);
            }
        }
        arr = new int[ls.size()];
        for (Integer val:ls) {
            arr[count++] = val;
        }
        return arr;

    }
}
