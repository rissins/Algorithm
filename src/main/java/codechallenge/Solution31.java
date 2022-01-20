package codechallenge;



//https://programmers.co.kr/learn/courses/30/lessons/87389
public class Solution31 {
    public int solution(int n) {
        int answer = 0;
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution31 solution26 = new Solution31();
        int solution = solution26.solution(10);
    }
}
