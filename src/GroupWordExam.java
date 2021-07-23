import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int N = Integer.parseInt(sc.nextLine());
        int groupWordCount = 0;

        for (int testCase = 0; testCase < N; testCase++) {
            String word = sc.nextLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }
        System.out.println("groupWordCount = " + groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        String[] characterArray = new String[word.length()];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterArray[i] = word.substring(i, i + 1);
        }
        // set = {h, a, p}
        // h a p p y
        // ^     ^
        //       o o
        for (int i = 0; i < word.length() - 1; i++) {
            if (!characterArray[i].equals(characterArray[i+1])){
                if (set.contains(characterArray[i])) {
                    return false;
                }
                set.add(characterArray[i]);
            }
        }

        if (set.contains(characterArray[word.length()-1])) {
            return false;
        }
        return true;
    }
}



