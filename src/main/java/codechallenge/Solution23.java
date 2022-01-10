package codechallenge;


import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class Solution23 {
    public int[] solution(int[] arr) {
        List<Integer> integers = new ArrayList<>();
        integers.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                integers.add(arr[i + 1]);
            }
        }
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        solution23.solution(arr);

    }
}
