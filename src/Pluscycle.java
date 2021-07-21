import java.util.Scanner;

public class Pluscycle {
    public static void main(String[] args) {
        //첫줄에 N을 받음
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int n = Integer.parseInt(N); // parsing
        int newNumber = n; // loop 안에서 number의 시작지점.
        int loopCount = 0; // 몇 번 돌았는지 저장. 0 -> 처음 도는건 0

        do {
            loopCount++;
            newNumber = process(newNumber);
        } while (n != newNumber);

        System.out.println("loopCount = " + loopCount);

        //N의 사이클 길이 출력
    }

    private static int process(int oldNumber) {
        int sumOfnumber = oldNumber % 10 + oldNumber / 10;

        // 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙인다.
        int rightSumOfnumber = sumOfnumber % 10;
        int rightNumber = oldNumber % 10;

        int newNumber = rightNumber * 10 + rightSumOfnumber % 10;
        return newNumber;
    }
}
