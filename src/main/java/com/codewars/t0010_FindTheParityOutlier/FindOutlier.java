package com.codewars.t0010_FindTheParityOutlier;

public class FindOutlier {
    static int find(int[] integers) {
        int countOfEven = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                countOfEven++;
            }
        }

        for (int integer : integers) {
            if (integer % 2 == 0) {
                if (countOfEven < 2) {
                    return integer;
                }
            } else {
                if (countOfEven > 1) {
                    return integer;
                }
            }
        }

        return 0;
    }
}
