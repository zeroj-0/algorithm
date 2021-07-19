import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AverageExam {
    public static void main(String[] args) {

        //테스트 케이스 개수 받음
        //그 다음 줄부터 테스트 케이스마다 학생의 수 N이 첫수, 이어서 N명의 점수가 주어짐
        //각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까기 출력

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double[] studentRatio = new double[C];

        for (int i=0;i<C;i++) {
            //학생 수 받음
            int N = sc.nextInt();
            int[] universityScore = new int[N];

            //평균내기 전 점수 합친 것
            double sum =0;
            for (int j=0;j<N;j++) {
                int score = sc.nextInt();
                universityScore[j] = score;
                sum = sum + universityScore[j];
            }
            double average = sum/N;

            //평균넘는 학생들의 비율 측정

            double number = 0;
            for (int j=0;j<N;j++){
                if (universityScore[j]>average){
                    number++;
                }
            }
            studentRatio[i] = (number/N)*100;
        }
        for (int i=0;i<C;i++){
            System.out.println(String.format("%.3f",studentRatio[i])+"%");
        }

    }
}
