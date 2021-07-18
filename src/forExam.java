import java.io.*;
import java.util.StringTokenizer;

public class forExam {
    public static void main(String[] args) {
        //테스트케이스 받음
        //A+B 한줄에 하나씩 순서대로 출력
        //BufferedReader와 BufferedWriter를 사용할 수 있다.

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String nubmer = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(nubmer);

    }
}
