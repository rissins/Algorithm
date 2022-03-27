package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/60057
public class Solution39 {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            String prev = s.substring(0, i);
            int count = 1;
            StringBuilder enc = new StringBuilder();
            String last = "";
            for (int j = i; j < s.length(); j += i) {
                if (j + i > s.length()) {
                    last = s.substring(j);
                    continue;
                }
                if (prev.equals(s.substring(j, j + i))) {
                    count++;
                } else {
                    enc.append(prev);
                    if (count != 1) {
                        enc.insert(0, count);
                    }
                    prev = s.substring(j, j + i);
                    count = 1;
                }
            }
            enc.append(prev).append(last);
            if (count != 1) {
                enc.insert(0, count);
            }

            answer = Math.min(answer, enc.length());
        }

        return answer;
    }
}
