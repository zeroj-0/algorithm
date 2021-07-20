import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringRepetitionExam {
    public static void main(String[] args) {
        //테스트 케이스 개수 받음 (T)
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int T = sc.nextInt();
        sc.nextLine();

        //칵 테스트 케이스는 반복횟수 받음 (R)
        //각 문자열을 반복횟수만큼 반복하는 P를 만들어 출력

        for (int i=0;i<T;i++){
            String strings = sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(strings);
            int R = Integer.parseInt(stringTokenizer.nextToken());
            String str = stringTokenizer.nextToken();

            List<String> stringList = new ArrayList<>();
            StringBuffer stringBuffer = new StringBuffer();
            List<String> totalArray = new ArrayList<>();

            for (int j=0;j<str.length();j++){
                stringList.add(str.substring(j,j+1));
            }

            for (int j=0;j<stringList.size();j++){
                for (int l=0;l<R;l++) {
                    stringBuffer.append(stringList.get(j));
                }
            }

            totalArray.add(stringBuffer.toString());
            System.out.println(totalArray.get(0));
        }


    }
}
