package codechallenge;


import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/92334
public class Solution38 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }
}
