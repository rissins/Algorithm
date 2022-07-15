package algorithm;

//https://programmers.co.kr/learn/courses/30/lessons/68935
public class Solution4 {
    public int solution(int n) {
        StringBuilder remainNumber = new StringBuilder();
        while (n > 2) {
            int i = n % 3;
            remainNumber.append(i);
            n /= 3;
        }
        remainNumber.append(n);
        return Integer.parseInt(remainNumber.toString(), 3);
    }

    public static void main(String[] args) {
        Solution4 solution3 = new Solution4();
        solution3.solution(125);
    }
}
