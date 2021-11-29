package codechallenge;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int totalNumber = 45;

        for (int number : numbers) {
            for (int j = 0; j < 10; j++) {
                boolean contains = Arrays.asList(number).contains(j);
                if (contains) {
                    totalNumber -= j;
                }

            }
        }
        return totalNumber;
    }
}
