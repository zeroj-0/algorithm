import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        //소문자로만 이루어진 단어 받음
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] alpabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //단어에 포함되어 있는 경우에는 등장하는 위치, 아닌 경우는 -1을 출력하는 프로그램
        for (String str : alpabet) {
            System.out.print(word.indexOf(str)+ " ");
        }
    }
}
