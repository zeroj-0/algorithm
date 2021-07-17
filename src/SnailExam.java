import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnailExam {
    public static void main(String[] args) {
        //달팽이가 V미터인 나무 막대를 올라간다
        //V미터 받아주기
        //낮에는 A미터 올라갈 수 있고, 밤에 자는 동안 B미터 미끄러진다 <-- 한번씩 빼주고 더해주고
        //정상 올라가면 미끄러지지 않는다
        //나무 막대를 모두 올라가려면 며칠이 걸리는가
        //첫줄에 A,B,V가 주어진다

        Scanner sc = new Scanner(System.in);
        int woodenStick = sc.nextInt();
        int plusMeter = sc.nextInt();
        int subtractMeter = sc.nextInt();

        sc.close();

        int currentLocation = 0;

        int day =0;

        //woodStick과 currentLocation이 같아질때까지 반복해야하는데 몇번 ???
        while (true){
            currentLocation = plusMeter-subtractMeter;
            day++;
            if (currentLocation == woodenStick){
                System.out.println(day);
                break;
            }
        }

    }
}
