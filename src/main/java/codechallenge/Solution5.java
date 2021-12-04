package codechallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/12919
public class Solution5 {

    public String solution(String[] seoul) {
        String result;
        List<String> seoulList = Arrays.stream(seoul).collect(Collectors.toList());
        int kimIndex = seoulList.indexOf("Kim");
        result = "김서방은 " + kimIndex + "에 있다";
        return result;
    }

}
