package programmers;

import java.util.ArrayList;
import java.util.List;

public class P120813 {
    public int[] solution(int n) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                integers.add(i);
            }
        }
        return integers.stream().mapToInt(i -> i).toArray();
    }
}
