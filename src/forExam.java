import java.io.*;
import java.util.StringTokenizer;

public class forExam {
    public static void main(String[] args) throws IOException {
        //테스트케이스 받음
        //A+B 한줄에 하나씩 순서대로 출력
        //BufferedReader와 BufferedWriter를 사용할 수 있다.

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        //테스트 케이스 받은 것 String값 int값으로 바꿔줌
        String number = bufferedReader.readLine();
        int realNumber = Integer.parseInt(number);


        for (int i=0;i<realNumber;i++){
            //받아서 문자열 바로 쪼개줌
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            //BufferedWriter를 쓸려면 String값으로 넣어줘야한다
            bufferedWriter.write(String.valueOf(A+B));
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();

    }
}
