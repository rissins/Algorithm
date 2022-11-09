package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class P12933 {
    public long solution(long n) {
        String[] strings = String.valueOf(n).split("");
        long[] longs = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder())
                .mapToLong(Integer::parseInt)
                .toArray();
        StringBuilder sb = new StringBuilder();
        for (long aLong : longs) {
            sb.append(aLong);
        }
        return Long.parseLong(sb.toString());
    }
}
