package codechallenge;


import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/72410
public class Solution22 {

    static List<String> combi;
    /**
     * 1. order에서 높은 것 순으로 카운트하여 재배치 -> 최소 2개
     * 2. course 갯수 만큼 높은순으로 저장
     */
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        combi = new ArrayList<>();
        //코스 메뉴조합의 모든 경우의 수 구하기 (dfs)
        for (int i = 0; i < orders.length; i++) {
            String[] one = orders[i].split("");
            Arrays.sort(one);

            for (int j = 0; j < one.length - 1; j++) {
                for (int k = 0; k < course.length; k++) {
                    dfs(one, j, 1, course[k], one[j]);
                }
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String menu : combi) {
            map.put(menu, map.getOrDefault(menu, 0) + 1);
        }


        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return map.get(o2) - map.get(o1);
            }
        });


        List<String> res = new ArrayList<>();
        for (int i = 0; i < course.length; i++) {
            int max = 0;

            // course 갯수별로 가장 인기있는 품목 선정
            for (String courseMenu : list) {
                if (map.get(courseMenu) > 1 && courseMenu.length() == course[i]) {
                    if (map.get(courseMenu) >= max) {
                        res.add(courseMenu);
                        max = map.get(courseMenu);
                    }
                }
            }
        }

        // 문자순 정렬
        Collections.sort(res);

        answer = new String[res.size()];
        res.toArray(answer);


        return answer;
    }


    static void dfs(String[] one, int idx, int len, int courseLen, String str) {
        if (len == courseLen) {
            combi.add(str);
        }

        for (int i = idx + 1; i < one.length; i++) {
            dfs(one, i, len + 1, courseLen, str + one[i]);
        }
    }


    public static void main(String[] args) {
        Solution22 solution15 = new Solution22();
        String[] order = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};

        String[] solution = solution15.solution(order, course);
        for (String s : solution) {
            System.out.println("s = " + s);
        }


//        solution15.solution(order, course);

    }
}
