package codechallenge;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/12935
public class Solution32 {
    public int[] solution(int[] arr) {
        int[] ten = {-1};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.stream(arr).filter(value ->
                value == Arrays.stream(arr)
                        .min()
                        .getAsInt())
                .boxed()
                .forEach(collect::remove);
        return arr.length == 1 && arr[0] == 10 ? ten : collect.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution32 solution26 = new Solution32();
        int[] aa = {4, 3, 2, 1};
        solution26.solution(aa);
    }
}
