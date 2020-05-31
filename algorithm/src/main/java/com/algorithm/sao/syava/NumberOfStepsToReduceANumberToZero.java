package com.algorithm.sao.syava;

public class NumberOfStepsToReduceANumberToZero {
    //var 1
    public int numberOfSteps (int num) {
        return numberOfStepsWithRec(num, 0);
    }

    public int numberOfStepsWithRec(int num, int count) {
        if(num == 0){
            return count;
        }

        if (num % 2 == 0) {
            return numberOfStepsWithRec(num/2, ++count);
        } else {
            return numberOfStepsWithRec(num-1, ++count);
        }

    }

    //var 2
//    public static int numberOfSteps (int num) {
//        int count = 0;
//        while (num != 0) {
//            if (num % 2 == 0) {
//                num = num / 2;
//                count++;
//            } else {
//                num = num - 1;
//                count++;
//            }
//        }
//        return count;
//    }
}
