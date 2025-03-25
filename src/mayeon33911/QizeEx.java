package mayeon33911;

import java.util.Scanner;

public class QizeEx {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("값을 입력하세요 >> ");
            input = sc.nextInt();
            count++;

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (answer == input) {
                System.out.println("정답입니다.");
                System.out.println(count + " 번 만에 맞히셨습니다.");
                break;
            }
        }
    }
}
