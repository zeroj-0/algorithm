import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CroatiaExam {
    public static void main(String[] args) {

        //표에 나와있는 알파벳은 변경된 형태로 입력
        //입력으로 주어진 단어가 몇개의 크로아티아 알파벳으로 이루어져 있는지 출력

        //크로아티아 알파벳 배열 반들어줍니다
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        char[] alphabetArray = new char[26];
        for (int i=0;i<alphabetArray.length;i++){
            alphabetArray[i] = (char)('a'+i);
        }
        List<String[]> numberCount = new ArrayList<>();

        //크로아티아 문자열 받음
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();

        int count = 0;
        int num = 0;
        for (int i=0;i<croatia.length;i++){
            if (alphabet.contains(croatia[i])){
                count++;
                numberCount.add(alphabet.split(croatia[i]));
            }
        }
        for (int i=0;i<numberCount.size();i++){
            for (int j=0;j<alphabetArray.length;j++){
                if (numberCount.get(i).equals(alphabetArray[j])){
                    num++;
                }
            }
        }
        System.out.println(count+num);
    }
}
