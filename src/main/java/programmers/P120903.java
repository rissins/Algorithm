package programmers;

import java.util.Arrays;

public class P120903 {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for (String value : s1) {
            for (String s : s2) {
                if (value.compareTo(s) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
