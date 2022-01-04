package codechallenge;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12917
public class Solution18 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        characters.sort(Comparator.comparing(Character::charValue).reversed());
        for (Character character : characters) {
            answer.append(character);
        }
        String s1 = answer.toString();
        return s1;
    }

    public static void main(String[] args) {
        Solution18 solution15 = new Solution18();
        String zbcdefg = solution15.solution("Zbcdefg");
        System.out.println("zbcdefg = " + zbcdefg);

    }
}
