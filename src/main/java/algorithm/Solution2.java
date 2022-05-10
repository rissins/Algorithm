package algorithm;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12930
public class Solution2 {
//            "try hello world"	"TrY HeLlO WoRlD"
    public String solution(String s) {

        String[] stringsBySplit = s.toLowerCase().split(" ", -1);
        List<String> stringList = new ArrayList<>();
        for (String s1 : stringsBySplit) {
            StringBuilder answer = new StringBuilder();
            String[] strings = s1.split("");
            for (int i = 0; i < strings.length; i++) {
                if ((i + 1) % 2 == 1) {
                    answer.append(strings[i].toUpperCase());
                } else
                    answer.append(strings[i]);

            }
            stringList.add(answer.toString());
        }
        return String.join(" ", stringList);
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String try_hello_world = solution2.solution("asdad a worlasdasd vasdf");
        System.out.println("try_hello_world = " + try_hello_world);
    }
}
