package codechallenge;

//https://programmers.co.kr/learn/courses/30/lessons/12916
public class Solution20 {
    boolean solution(String s) {
        boolean answer = true;
        String s1 = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'p') {
                pCount++;
            }
            if (s1.charAt(i) == 'y') {
                yCount++;
            }
        }
        if (pCount != yCount) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution20 solution15 = new Solution20();
        solution15.solution("pPoooyY");

    }
}
