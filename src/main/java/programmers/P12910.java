package programmers;

import java.util.Arrays;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] ints = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        if (ints.length == 0) {
            return new int[]{-1};
        }
        return ints;
    }
}
