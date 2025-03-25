package mayeon33911;

public class Ex_for {
    public static void main(String[] args) {
        // 1에서 10까지의 합
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println("1에서 10까지의 합은 : " + sum);

        // 1에서 10까지의 숫자 중 짝수 또는 홀수들의 합
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println("--------------------");
        System.out.printf("짝수의 합은 : %d\n", oddSum);
        System.out.printf("홀수의 합은 : %d\n", evenSum);
        System.out.println("--------------------");
    }
}
