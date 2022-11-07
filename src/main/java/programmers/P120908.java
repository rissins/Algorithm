package programmers;

import java.util.Arrays;

public class P120908 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }
}
