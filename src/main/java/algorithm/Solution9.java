package algorithm;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Solution9 {
    public String solution(int[] numbers) {
        if (Arrays.stream(numbers).allMatch(value -> value == 0)) return "0";
        String[] strings = new String[numbers.length];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        return Stream.of(strings)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        Solution9 solution9 = new Solution9();
        solution9.solution(numbers);
    }
}
