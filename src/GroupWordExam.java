import java.util.Scanner;

public class GroupWordExam {
    public static void main(String[] args) {
        //문자가 연속해서만 나타나는 경우를 그룹단어라고 함
        //단어N개를 입력받아 그룹단어의 개수를 출력하는 프로그램 작성

        //모르겠다 !!!!!!!!!!!
        char[] alphabetArray = new char[26];
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = (char) ('a' + i);
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=0;i<N;i++){
            String str = sc.nextLine();
        }
    }
}
