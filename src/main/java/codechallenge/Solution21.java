package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/72410
public class Solution21 {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        answer = answer.replaceAll("[.]+", ".");

        answer = answer.replaceAll("^[.]", "").replaceAll("[.]$", "");

        if (answer.isBlank()) {
            answer = answer.replaceAll("", "a");
        }

        if (answer.length() >= 15 || answer.substring(answer.length() -1).equals(".")) {
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        }

        if (answer.length() < 3) {
            answer = answer + answer.substring(answer.length() - 1).repeat(3 - answer.length());
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution21 solution15 = new Solution21();
//        solution15.solution("=.=");
        solution15.solution("123_.def");
//        solution15.solution("...!@BaT#*..y.abcdefghijklm");

    }
}
