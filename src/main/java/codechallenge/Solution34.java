package codechallenge;


import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
public class Solution34 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int j : d) {
            if (j <= budget) {
                budget = budget - j;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution34 solution26 = new Solution34();
        int[] a = {1, 3, 2, 5, 4};
        solution26.solution(a, 10);
    }
}
