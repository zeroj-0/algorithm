import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List<Integer> countArray = new ArrayList<>();

        for (int i=0;i<alphabetArray.length;i++){
            countArray.add(0);
        }


        //대소문자 상관없이 비교하기 위해서 받은 문자열 다 대문자로 바꿔줌
        word = word.toUpperCase();

        //문자열 쪼갬
        for (int i=0;i<word.length();i++){
            wordArray[i] = word.substring(i,i+1);
        }

        //그리고 가장 사용 많이된 문자 출력

        //사용 많이된 인덱스 찾아내기 위함. 사용된 알파벳자리에 +1씩 해줌
        for (int i=0;i<wordArray.length;i++){
            for (int j=0;j<alphabetArray.length;j++){
                if (wordArray[i].equals(String.valueOf(alphabetArray[j]))){
                    countArray.set(j,countArray.get(j)+1);

                }
            }
        }

        int max = countArray.get(0);
        int maxIndex = 0;
        List<Integer> zero = new ArrayList<>();

        //많이 사용된 인덱스값 찾기
        for (int i=0;i<countArray.size();i++){
            if (countArray.get(i)>max){
                max = countArray.get(i);
                maxIndex = countArray.indexOf(countArray.get(i));
            }
            else if (countArray.get(i)<max){
                max = max;
            }
            //0이아닌 숫자 받아놓기
            if (countArray.get(i) != 0 ){
                zero.add(countArray.get(i));
            }
        }

        //배열 안에 숫자들 비교해서 사용된 알파벳수가 같으면 ?출력 다르면 많이 사용된 알파벳 출력
        for (int i=0;i<zero.size()-1;i++){
            if (zero.get(i) == zero.get(i+1)){
                maxIndex = 30;
            }
        }
        if (maxIndex == 30) {
            System.out.println("?");
        }
        else {
            System.out.println(alphabetArray[maxIndex]);
        }
    }
}
