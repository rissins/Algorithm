package codechallenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/72412
public class Solution27 {
    public int[] solution(String[] info, String[] query) {

        /**
         * 1. 지원자의 특성 분석
         * 2. 요구사항 분석
         * 3. 요구사항에 따른 지원자의 값 출력
         */
        List<List<String>> infoList = new ArrayList<>();
        List<List<String>> queryList = new ArrayList<>();
        int[] answer = {};
        for (String s : info) {
            List<String> strings = developerInfo(s);
            infoList.add(strings);
        }
        for (String s : query) {
            List<String> strings = queryInfo(s);
            queryList.add(strings);
        }


        for (List<String> strings : queryList) {
//            for (String string : strings) {
            for (List<String> stringList : infoList) {
            }
//            }
        }
        System.out.println("infoList = " + infoList);
        System.out.println("queryList = " + queryList);




        return answer;
    }

    private List<String> developerInfo(String s) {
        String[] s1 = s.split(" ");
        return new ArrayList<>(Arrays.asList(s1));
    }

    private List<String> queryInfo(String s) {
        String[] s1 = s.replace(" ", "").replaceAll("[0-9]", "").split("and");
        String s2 = s.replaceAll("[^0-9]", "");
        List<String> lists = new ArrayList<>(Arrays.asList(s1));
        lists.add(s2);
        return lists;
    }

    static class Person {
        int a;
        String b;

        public Person(int a, String b) {
            this.a = a;
            this.b = b;
        }
    }



    public static void main(String[] args) {
        Solution27 solution26 = new Solution27();
        String[] info = {"java backend junior pizza 150"
                , "python frontend senior chicken 210"
                , "python frontend senior chicken 150"
                , "cpp backend senior pizza 260"
                , "java backend junior chicken 80"
                , "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100"
                , "python and frontend and senior and chicken 200"
                , "cpp and - and senior and pizza 250"
                , "- and backend and senior and - 150"
                , "- and - and - and chicken 100"
                , "- and - and - and - 150"};

        solution26.solution(info, query);
    }
}

