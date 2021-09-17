import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordSort {
    public static void main(String[] args) {

        //첫째줄에 단어의 개수 N이 주어짐
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        List<String> list = new ArrayList<>();

        for (int i=0;i<N;i++){
            String word = scanner.nextLine();
            list.add(word);
        }


        //알파벳 소문자로 이루어진 단어 N개가 주어지면 단어길이가 짧은거부터 길이가 같으면 사전순으로 정렬하는 프로그램 작성

        sort(list);


    }

    private static void sort(List<String> list) {

        Collections.sort(list);

        System.out.println("list = " + list.toString());

        //같은 단어가 여러개 입력되는 경우 하나만 출력
        for (int i=1;i<list.size();i++){
            if (list.get(i-1).equals(list.get(i))){
                list.remove(list.get(i));
            }
        }


        for (String str : list) {
            System.out.println(str);
        }
    }
}
