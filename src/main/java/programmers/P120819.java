package programmers;

public class P120819 {
    public int[] solution(int money) {
        int coffeeCount = money / 5500;
        int spareMoney = money % 5500;
        return new int[]{coffeeCount, spareMoney};
    }
}
