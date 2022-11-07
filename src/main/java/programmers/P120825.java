package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P120825 {
    public String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = my_string.split("");
        Arrays.stream(split)
                .forEach(s ->
                stringBuilder.append(String.valueOf(s).repeat(Math.max(0, n)))
        );
        return stringBuilder.toString();
    }
}
