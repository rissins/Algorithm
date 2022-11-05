package programmers;

public class P120830 {
    public int solution(int n, int k) {
        int service = n / 10;
        int nSum = 12000 * n;
        int kSum = 2000 * (k - service);
        return nSum + kSum;
    }
}
