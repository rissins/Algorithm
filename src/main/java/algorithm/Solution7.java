package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Solution7 {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
