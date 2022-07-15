package algorithm;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Solution6 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            integers.add(num);
        }

        if (integers.size() > max) {
            return max;
        } else {
            return integers.size();
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        Solution6 solution6 = new Solution6();
        solution6.solution(nums);
    }
}
