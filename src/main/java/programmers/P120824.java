package programmers;

public class P120824 {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : num_list) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }
}
