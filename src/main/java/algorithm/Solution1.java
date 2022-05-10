package algorithm;

//https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
public class Solution1 {
//            1	1	6	14
//            2	2	7	21
//            3	4	8	22
//            4	11	9	24
//            5	12	10	41
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while (num > 0) {
            int remainder = num % 3;
            num /= 3;
            if (remainder == 0 ) num--;

            answer = numbers[remainder] + answer;
        }
        return answer;
    }
}
