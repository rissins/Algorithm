package algorithm;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12916
public class Solution3 {
    boolean solution(String s) {
        boolean answer = true;
        String s1 = s.toLowerCase();
        int yCount = 0;
        int pCount = 0;
        String[] split = s1.split("");
        for (String s2 : split) {
            if (s2.equals("y")) {
                yCount++;
            } else if (s2.equals("p")) {
                pCount++;
            }
        }
        if (yCount != pCount) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        boolean pPoooyY = solution3.solution("Pyy");
        System.out.println("pPoooyY = " + pPoooyY);
    }
}
