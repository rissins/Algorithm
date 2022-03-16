package codechallenge;


import java.util.*;
import java.util.stream.Collectors;


//전체 학생의 수는 2명 이상 30명 이하입니다.
//체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
//여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
//이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.

//https://programmers.co.kr/learn/courses/30/lessons/92334
public class Solution37 {
    public int solution(int n, int[] lost, int[] reserve) {
//        int count = 0;
//        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
//        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
//
//        for (int i : reserveList) {
//            if (lostList.contains(i)) {
//                count--;
//                lostList.remove(Integer.valueOf(i));
//                reserveList.remove(Integer.valueOf(i));
//            }
//        }
//
//        for (int i : reserveList) {
//            if (lostList.contains(i - 1)) {
//                count++;
//                lostList.remove(Integer.valueOf(i - 1));
//            } else if (reserveList.size() > i && lostList.contains(i + 1)) {
//                count++;
//                lostList.remove(Integer.valueOf(i + 1));
////                collect.remove(i + 1);
//            }
//        }
//
////        int total = n - lost.length + count;
//
//
//        return n - lost.length + count;
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0; i < lost.length; i++) {
            for(int j=0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        for (int i=0; i < lost.length; i++) {
            for (int j=0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
                    count++;
                    reserve[j] = -1;
                    break;

                }
            }
        }
        return n - lost.length + count;
    }



    public static void main(String[] args) {
        Solution37 solution26 = new Solution37();
        int solution = solution26.solution(5, new int[]{2,4}, new int[]{3});
        System.out.println("solution = " + solution);



    }
}
