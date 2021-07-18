import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HoneycombExam {
    public static void main(String[] args) {
        //아놔 .. .ㅇ...ㄹ.ㅁㄹ.... 좀따 해야징
        //벌집 중앙에서 나아갈 마지막 숫자 받습니동
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] honeyCombNumber = new int[num];
//        List<Integer> honeyCombCycle = new ArrayList<>();

        //전체 숫자받아서 6의 배수씩 나눈다음
        //해당 주기..출력 ..? 흠냐흠냐
        for (int i=0;i<num;i++){
            honeyCombNumber[i] = i+1;


        }

        System.out.println(Arrays.toString(honeyCombNumber));



        //중앙 1번에서부터 최소갯수의 방을 지나갈때 몇개의 방이 지나가는가

        //중앙을 중심으로 돌아갈때 +6씩 됨 (6의배수)
        //첫번째 1
        //두번째 6
        //세번째 6+6
        //네번째 6+6+6
        // min = 1
        // max = 1

        // min 2
        // max 7

        // min 8
        // max 19



        //마지막 숫자가 홀수이면 일자로
        //마지막 숫자가 짝수이면 일자로+1



    }

}
