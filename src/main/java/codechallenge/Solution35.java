package codechallenge;


import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/92334
public class Solution35 {
    public int[] solution(String[] id_list, String[] report, int k){
        Map<String, HashSet<String>> reportMemberList = new HashMap<>();
        Map<String, Integer> getMailCount = new HashMap<>();
        for(String id : id_list){
            getMailCount.put(id,0);
            reportMemberList.put(id,new HashSet<>());
        }

        for(String rep : report){
            String[] checkReport = rep.split(" ");
            reportMemberList.get(checkReport[1]).add(checkReport[0]);
        }

        for(String key : reportMemberList.keySet()){
            HashSet<String> reporters = reportMemberList.get(key);
            if(reporters.size() >= k){
                for(String reporter : reporters){
                    Integer getMail = getMailCount.get(reporter);
                    getMailCount.put(reporter,getMail+1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = getMailCount.get(id_list[i]);
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution35 solution26 = new Solution35();
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] solution = solution26.solution(idList, report, k);
        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}
