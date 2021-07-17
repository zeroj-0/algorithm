import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class NumberExam {
    public static void main(String[] args) {
        //첫줄에 상근이가 칠판에 적은 두수를 받는다
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        sb.append(sc.nextLine());

        //받은 두수를 뒤집는다
        sb.reverse();
        //그 받은 두수를 " "을 기준으로 나눈다
        String number = sb.toString();
        String[] new_number = number.split(" ");

        //그 String값을 int로 받아준다
        int num1 = Integer.parseInt(new_number[0]);
        int num2 = Integer.parseInt(new_number[1]);
        //두 수 비교하고 큰 값 출력
        if (num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
