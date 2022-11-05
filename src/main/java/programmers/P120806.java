package programmers;

public class P120806 {
    public int solution(int num1, int num2) {
        double answer = num1 / (double) num2;
        return (int) (answer * 1000);
    }
}
