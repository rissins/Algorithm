package codechallenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/12930
public class Solution29 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        String[] strings = s.split("");

        for (String string : strings) {
            count = string.contains(" ") ? 0 : count + 1;
            answer.append(count % 2 == 0 ? string.toLowerCase() : string.toUpperCase());
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution29 solution26 = new Solution29();
        String try_hello_world = solution26.solution("try hello world");
        System.out.println("try_hello_world = " + try_hello_world);
    }
}
