package programmers;

import java.util.Arrays;

public class P120809 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
