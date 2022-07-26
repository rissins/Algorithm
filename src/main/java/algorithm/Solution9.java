package algorithm;


import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Solution9 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strings = new String[numbers.length];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String string : strings) {
            answer.append(string);
        }

        if (strings[0].equals("0")) {
            return "0";
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        Solution9 solution9 = new Solution9();
        solution9.solution(numbers);
    }
}
