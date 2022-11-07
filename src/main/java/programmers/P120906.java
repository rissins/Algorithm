package programmers;

public class P120906 {
    public int solution(int n) {
        int result = 0;
        String[] split = String.valueOf(n).split("");
        for (String s : split) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
