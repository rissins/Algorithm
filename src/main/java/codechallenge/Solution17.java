package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12922
public class Solution17 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution17 solution15 = new Solution17();
        solution15.solution(6);
    }
}
