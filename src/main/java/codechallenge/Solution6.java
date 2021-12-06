package codechallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution6 {

    public int solution(String s) {

        Map<String, Integer> numberToString = new HashMap<>();
        List<Integer> aa = new ArrayList<>();

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



        for (String s1 : numberToString.keySet()) {
            if (s.contains(s1)) {
                s.replaceAll(s1, String.valueOf(numberToString.get(s1)));
                aa.add(numberToString.get(s1));
            } else {

            }
        }
        if (s.contains(String.valueOf(value))) {
            System.out.println("value = " + value);
        }

        for (String value : numberToString.values()) {

        }
        System.out.println("aa.toString() = " + aa.toString());


        return 1;
    }

    public static void main(String[] args) {

        String s = "one4seveneight";
        Solution6 solution6 = new Solution6();
        solution6.solution(s);
    }
}
