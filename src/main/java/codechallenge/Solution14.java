package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12912
public class Solution14 {
    public long solution(int a, int b) {
        long sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        if (b < a) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
