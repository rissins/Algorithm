package algorithm;


//피보나치 팩토리얼
public class Solution10 {

    public int fibonacci(int num) {
        int result = 0;

        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        } else if (num >= 3) {
            return fibonacci(num - 2) + fibonacci(num - 1);
        }
        return result;
    }

    public int factorial(int num) {

        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int fibonacci = solution10.fibonacci(6);
        int factorial = solution10.factorial(3);
        System.out.println("factorial = " + factorial);
//        System.out.println("fibonacci = " + fibonacci);
    }
}
