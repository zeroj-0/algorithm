import learn.NumberController;

import java.util.Scanner;

public class Pluscycle {
    public static void main(String[] args) {
        //첫줄에 N을 받음
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int n = Integer.parseInt(N); // parsing
        int newNumber = n; // loop 안에서 number의 시작지점.
        int loopCount = 0; // 몇 번 돌았는지 저장. 0 -> 처음 도는건 0
        NumberController numberController = new NumberController();

        do {
            loopCount++;
            newNumber = numberController.control(newNumber);
        } while (n != newNumber);

        System.out.println("loopCount = " + loopCount);

        //N의 사이클 길이 출력
    }

}
