package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12918
public class Solution13 {

    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("[+-]?\\d*(\\.\\d+)?");
        }
        return false;
    }
}
