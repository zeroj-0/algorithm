import java.util.Scanner;

public class WordStudyExam {
    public static void main(String[] args) {
        //알파벳 대소문자로 이루어진 단어가 주어질때, 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램 작성
        //알파벳 배열 만들어줌
        char[] alphabetArray = new char[26];
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = (char) ('A' + i);
        }

        //문자열 받음
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] wordArray = new String[word.length()];
        for (int i=0;i< wordArray.length;i++){
            wordArray[i] = word.substring(i,i+1);
        }

        //대소문자 상관없이 비교하는 equalsignorecase사용
        for (int i=0;i<wordArray.length;i++){
            for (int j=0;j< alphabetArray.length;j++) {
                if (wordArray[i].equalsIgnoreCase(String.valueOf(alphabetArray[j]))){

                }
            }
        }


    }
}
