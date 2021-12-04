package codechallenge;

import java.util.*;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/42748
public class Solution4 {

//    public int[] solution(int[] array, int[][] commands) {
//
//        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
//        List<Integer> result = new ArrayList<>();
//        int[] results = new int[commands.length];
//
//
//        for (int i = 0; i < commands.length; i++) {
//
//            List<Integer> sliceNumbers = new ArrayList<>();
//            for (int j = 0; j < 3; j++) {
//                sliceNumbers.add(commands[i][j]);
//            }
//            List<Integer> integers;
//            Integer integer;
//            integers = arrayList.subList(sliceNumbers.get(0) - 1, sliceNumbers.get(1));
//            Collections.sort(integers);
//            integer = integers.get(sliceNumbers.get(2) - 1);
//            result.add(integer);
//        }
//
//        for (int j = 0; j < result.size(); j++) {
//            results[j] = result.get(j);
//        }
//
//        return results;
//    }

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> input = Arrays.stream(array).boxed().collect(Collectors.toList());

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = splitAndSort(input, commands[i][0], commands[i][1], commands[i][2]);
        }
        return answer;
    }

    // 1 2
    private int splitAndSort(List<Integer> input, int start, int end, int index) {
        return input.subList(start - 1, end)
                .stream()
                .sorted()
                .collect(Collectors.toList()).get(index - 1);
    }


    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution4.solution(array, commands);
    }
}
