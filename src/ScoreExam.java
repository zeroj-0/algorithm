import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class ScoreExam {
    public static void main(String[] args) {
        //시험본 과목 갯수 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //세준이의 현재성적 받기
        double[] exam = new double[N];
        for (int i=0;i<N;i++){
            exam[i] = sc.nextInt();
        }
        //세준이의 성적 중 최고점 찾기

        double max = exam[0];
        for (int i=0;i<N;i++){
            if (exam[i]>max){
                max = exam[i];
            }
            else if (exam[i]<max){
                max=max;
            }
        }

        //현재성적/최고점*100 계산
        double[] newExam = new double[N];
        for (int i=0;i<N;i++){
            newExam[i] = exam[i]/max*100;
        }
        //새로운 점수의 평균구하기
        double sum=0;
        for (int i=0;i<N;i++){
            sum = sum+newExam[i];
        }
        double average=sum/N;

        System.out.printf("%.2f",average);

    }
}
