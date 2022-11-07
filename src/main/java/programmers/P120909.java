package programmers;

public class P120909 {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);

        if(sqrt == (int) sqrt){
            return (int)Math.pow(sqrt + 1, 2);
        } else return -1;
    }
}
