package programmers;

public class P12948 {
    public String solution(String phone_number) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = phone_number.split("");
        for (int i = 0; i < strings.length - 4; i++) {
            stringBuilder.append("*");
        }
        for (int i = strings.length - 4; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }
}
