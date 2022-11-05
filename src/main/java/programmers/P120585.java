package programmers;

import java.util.Arrays;

public class P120585 {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
