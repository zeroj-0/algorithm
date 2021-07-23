import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortExam {
    public static void main(String[] args) throws IOException {
//        List<Integer> sortList = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i=0;i<N;i++){
//            sortList.add(sc.nextInt());
//        }
//        sortList.sort(Comparator.naturalOrder());
//        for (int i=0;i<N;i++){
//            System.out.println(sortList.get(i));
//        }

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String number = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(number);
            int realNumber = Integer.parseInt(stringTokenizer.nextToken());
            numberList.add(realNumber);
        }
        numberList.sort(Comparator.naturalOrder());
        for (int i=0;i<N;i++){
            System.out.println(numberList.get(i));
        }
    }
}
