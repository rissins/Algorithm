package codechallenge;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12915
public class Solution8 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n + 1);
        }
        Arrays.sort(answer);
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(n, n + 1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        String[] strings1 = {"abce", "abcd", "cdx"};


        Solution8 solution8 = new Solution8();
        solution8.solution(strings1, 2);
    }

}
