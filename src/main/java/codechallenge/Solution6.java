package codechallenge;

import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/81301
public class Solution6 {

    public int solution(String s) {

        Map<String, Integer> numberToString = new HashMap<>();

        numberToString.put("zero", 0);
        numberToString.put("one", 1);
        numberToString.put("two", 2);
        numberToString.put("three", 3);
        numberToString.put("four", 4);
        numberToString.put("five", 5);
        numberToString.put("six", 6);
        numberToString.put("seven", 7);
        numberToString.put("eight", 8);
        numberToString.put("nine", 9);

        for (Map.Entry<String, Integer> stringIntegerEntry : numberToString.entrySet()) {
            if (s.contains(stringIntegerEntry.getKey())) {
                s = s.replaceAll(stringIntegerEntry.getKey(), String.valueOf(stringIntegerEntry.getValue()));
            }
        }
        System.out.println("Integer.parseInt(s) = " + Integer.parseInt(s));
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        String s = "one4seveneight";
        Solution6 solution6 = new Solution6();
        solution6.solution(s);
    }
}
