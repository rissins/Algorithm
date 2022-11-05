package programmers;

import java.util.Arrays;

public class P120583 {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(value -> value == n).count();
    }
}
