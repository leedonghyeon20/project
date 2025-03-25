package popo;

public class soso {

    public static void main(String[] args) {

        String str = "";

        // 1. 알파벳 배열 생성
        int[] arr = new int[26];

        // 2. 입력되는 문자열의 문자를 검사해 대소문자에 상관없이 알파벳 배열에 사용된 알파벳의 개수를 넣는다.
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자 범위
                arr[str.charAt(i) - 'A']++;
            } else { // 소문자 범위
                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = -1; // 사용된 알파벳 개수는 0 이상이므로 최댓값을 -1로 둔다.
        char ch = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            } else if (max == arr[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
