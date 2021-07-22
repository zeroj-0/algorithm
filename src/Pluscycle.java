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

        //do-while : 조건이 true일 경우 실행, false인 경우 종료(미실행)
        //무조건 한번 실행시킨 후 조건을 검사하여 반복을 결정
        do {
            loopCount++;
            newNumber = numberController.control(newNumber);
        } while (n != newNumber);

        System.out.println("loopCount = " + loopCount);



//        Scanner scan = new Scanner(System.in);
//
//        int num = scan.nextInt();
//        int temp = num;
//        int count = 0;
//
//        while(true) {
//            int left = temp / 10;
//            int right = temp % 10;
//            temp = right * 10 + (left + right) % 10;
//            count++;
//            if(num == temp) {
//                break;
//            }
//        }
//
//        System.out.println(count);

    }

}
