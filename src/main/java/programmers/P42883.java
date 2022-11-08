package programmers;

public class P42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        int scope = number.length() - k;

        for (int i = 1; i <= scope; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < number.length() - (scope - i); j++) {
                if ((number.charAt(j) - '0') == 9) {
                    max = 9;
                    idx = j;
                    break;
                }
                if (max < (number.charAt(j) - '0')) {
                    max = number.charAt(j) - '0';
                    idx = j;
                }
            }
            answer.append(max);
            number = number.substring(idx + 1);
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        P42883 p42883 = new P42883();
        p42883.solution(number, k);
    }
}
