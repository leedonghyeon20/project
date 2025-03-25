package mayeon33911;

public class DiceEx {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        switch (num) {
            case 1:
                System.out.println("1번 당첨!");
                break;
            case 2:
                System.out.println("2번 당첨!");
                break;
            case 3:
                System.out.println("3번 당첨!");
                break;
            case 4:
                System.out.println("4번 당첨!");
                break;
            case 5:
                System.out.println("5번 당첨!");
                break;
            case 6:
                System.out.println("6번 당첨!");
                break;
            default:
                System.out.println("그 외");
                break;
        }
        System.out.println("주사위 던지기를 종료합니다.");
    }
}
