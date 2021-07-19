import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaximunExam {
    public static void main(String[] args) {
        //N개의 정수 받음
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        //최솟값과 최댓값을 구하는 프로그램 작성
        //String값으로 받아 쪼개서 int값으로 넣어주고 비교
        String number = sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(number);
        String[] numberString = new String[N];
        int[] numberArray = new int[N];
        for (int i=0;i<N;i++){
            numberString[i] = stringTokenizer.nextToken();
            numberArray[i] = Integer.parseInt(numberString[i]);
        }
        //최대 최소 비교
        int max = numberArray[0];
        int min = numberArray[0];
        for (int i=0;i<N;i++){
            if (max>numberArray[i]){
                max = max;
            }
            else if (max<numberArray[i]){
                max = numberArray[i];
            }
        }
        for (int i=0;i<N;i++){
            if (min>numberArray[i]){
                min = numberArray[i];
            }
            else if (min<numberArray[i]){
                min = min;
            }
        }
        //최댓값과 최솟값을 공백으로 출력
        System.out.println(min + " " + max);
    }
}
