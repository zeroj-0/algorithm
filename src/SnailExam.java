import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SnailExam {
    public static void main(String[] args) throws IOException {
        //달팽이가 V미터인 나무 막대를 올라간다
        //낮에는 A미터 올라갈 수 있고, 밤에 자는 동안 B미터 미끄러진다 <-- 한번씩 빼주고 더해주고 반복
        //정상 올라가면 미끄러지지 않는다
        //나무 막대를 모두 올라가려면 며칠이 걸리는가
        //첫줄에 A,B,V가 주어진다

        // if.... A 10, B 100000000, V 10
//
//        Scanner sc = new Scanner(System.in);
//        int plusMeter = sc.nextInt();
//        int subtractMeter = sc.nextInt();
//        int woodenStick = sc.nextInt();
//
        // 고정
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // * 고정끝
        String s = bufferedReader.readLine(); // 한 줄을 받음
        StringTokenizer stringTokenizer = new StringTokenizer(s); // 스트링을 자름

        int plusMeter = Integer.parseInt(stringTokenizer.nextToken());
        int subtractMeter = Integer.parseInt(stringTokenizer.nextToken());
        int woodenStick = Integer.parseInt(stringTokenizer.nextToken());

        woodenStick = woodenStick - plusMeter;


        double v = (double) woodenStick / (double) (plusMeter - subtractMeter);
        double result = Math.ceil(v) + 1;
        System.out.println((int)result);

    }
}
