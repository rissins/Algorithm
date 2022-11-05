package programmers;

import java.util.Arrays;

public class P120831 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        P120831 p120831 = new P120831();
        p120831.solution(10);
    }
}


