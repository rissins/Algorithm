package programmers;

import java.util.Arrays;

public class P120854 {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
