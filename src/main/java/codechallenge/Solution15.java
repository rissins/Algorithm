package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12931
public class Solution15 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            answer = answer + Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        solution15.solution(456);
    }
}
