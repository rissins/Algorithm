package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/12934
public class Solution33 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        double v = sqrt - (int) sqrt;
        if (v != 0) {
            return -1;
        } else {
            return (long) ((sqrt + 1) * (sqrt + 1));
        }
    }

    public static void main(String[] args) {
        Solution33 solution26 = new Solution33();
        long solution = solution26.solution(122);
        System.out.println("solution = " + solution);
    }
}
