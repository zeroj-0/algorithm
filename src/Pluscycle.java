import java.util.Scanner;

public class Pluscycle {
    public static void main(String[] args) {
        //첫줄에 N을 받음
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        //String 값 한글자씩 나눠주기
        //String 값 int로 넣어주기
        String[] numberLength = new String[N.length()];

        if (numberLength.length == 2) {
            for (int i = 0; i < N.length(); i++) {
                numberLength[i] = N.substring(i, i + 1);

            }
        }
        //N의 사이클 길이 출력
    }
}
