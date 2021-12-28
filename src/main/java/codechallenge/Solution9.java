package codechallenge;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class Solution9 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int val = 0;

        Map<String, Integer> hm = new HashMap<>();

        for (String part : participant) {
            if (hm.get(part) == null)
                hm.put(part, 1);
            else {
                val = hm.get(part) + 1;
                hm.put(part, val);
            }
        }
        for (String comp : completion) {
            val = hm.get(comp) - 1;
            hm.put(comp, val);
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) == 1) answer = key;
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};
        String[] c = {"mislav", "stanko", "mislav", "ana", "mislav", "stanko", "mislav", "ana"};
        String[] d = {"stanko", "ana", "mislav", "stanko", "ana", "mislav", "mislav"};


        Solution9 solution9 = new Solution9();
        solution9.solution(c, d);
    }

}
