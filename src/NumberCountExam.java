import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberCountExam {
    public static void main(String[] args) {
        //ABC를 계산한 결과에 0부터9까지 각각의 숫자가 몇번 쓰였는지를 구하는 프로그램 작성
        //ABC 순서대로 입력 받음
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        //입력받은 String 곱셉하기 위해 int 값으로 다시 바꿔줌
        int new_A = Integer.parseInt(A);
        int new_B = Integer.parseInt(B);
        int new_C = Integer.parseInt(C);

        int mul = new_A*new_B*new_C;

        String finalNumber = Integer.toString(mul);

        //String값 하나하나씩 잘라줌
        String[] finalNumberArray = new String[finalNumber.length()];
        for (int i=0;i<finalNumber.length();i++){
            finalNumberArray[i] = finalNumber.substring(i,i+1);
        }

        String[] str= new String[]{"0","1","2","3","4","5","6","7","8","9"};
        //0인 배열 만들어주기
        List<Integer> zeroArray = new ArrayList<>();
        for (int i=0;i<10;i++){
            zeroArray.add(0);
        }
        int count = 0;


        //쓰인 숫자 갯수 세기
        for (int i=0;i<str.length;i++){
            for (int j=0;j<finalNumber.length();j++){
                if (finalNumberArray[j].equals(str[i])){
                    count=zeroArray.get(i)+1;
                    zeroArray.set(i,count);
                }
            }
        }
        for (int i=0;i<zeroArray.size();i++) {
            System.out.printf(String.valueOf(zeroArray.get(i))+"\n");
        }

    }
}
