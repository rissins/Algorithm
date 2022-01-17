package codechallenge;


import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12932
public class Solution28 {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        String[] splits = a.split("");
        List<Integer> s = new ArrayList<>();
        for (int i = splits.length -1; i >= 0; i--) {
            s.add(Integer.parseInt(splits[i]));
        }
        return s.stream().mapToInt(Integer::byteValue).toArray();
    }

    public static void main(String[] args) {
        Solution28 solution26 = new Solution28();
        int[] solution = solution26.solution(12345);
        System.out.println("solution.toString() = " + solution.toString());
    }
}
