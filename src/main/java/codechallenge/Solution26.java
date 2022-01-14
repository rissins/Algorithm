package codechallenge;


//https://programmers.co.kr/learn/courses/30/lessons/82612
public class Solution26 {
    public long solution(int price, int money, int count) {
        long answer;
        long sum = 0;
        long price1 = price;
        for (int i = 0; i < count; i++) {
            sum += price1;
            price1 = price1 + price;
        }
        answer = sum - money;
        if (answer < 0) answer = 0;
        return answer;
    }


    /**
     * Best Solution
     */
//    public long solution(long price, long money, long count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        solution26.solution(3, 20, 4);
    }
}
