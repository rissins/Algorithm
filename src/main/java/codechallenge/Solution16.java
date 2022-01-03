package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12931
public class Solution16 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution16 solution15 = new Solution16();
        solution15.solution(5);
    }
}
