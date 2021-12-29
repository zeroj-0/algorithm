import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        //피보나치 수는 0과 1로 시작
        //0번째 피보나치 수는 0
        //1번째 피보나치 수는 1
        //2번째 피보나치 수는 0번째와 1번째 수의 합
        //3번째는 1번째와 2번째 수의 합


        //n을 받아
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<Integer> numlist = new ArrayList<>();

        numlist.add(0);
        numlist.add(1);

        for (int i=0;i<number-1;i++){
            numlist.add(numlist.get(i)+numlist.get(i+1));
        }


        //n번째 피보나치 수 출력
        System.out.println("numlist = " + numlist.get(number));
    }
}
