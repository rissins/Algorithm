package codechallenge;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static java.time.DayOfWeek.*;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class Solution11 {

    public String solution(int a, int b) {
        Map<DayOfWeek, String> weekMap = new HashMap<>();
        weekMap.put(MONDAY, "MON");
        weekMap.put(TUESDAY, "TUE");
        weekMap.put(WEDNESDAY, "WED");
        weekMap.put(THURSDAY, "THU");
        weekMap.put(FRIDAY, "FRI");
        weekMap.put(SATURDAY, "SAT");
        weekMap.put(SUNDAY, "SUN");

        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return weekMap.get(dayOfWeek);
    }

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        solution11.solution(5, 24);
    }

}
