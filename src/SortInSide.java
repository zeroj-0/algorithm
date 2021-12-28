import java.util.*;

public class SortInSide {
    public static void main(String[] args) {
        // 정렬할 수를 받음
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        List<String> list = new ArrayList<>();

        // 각 자리수를 내림차순으로 정렬을 위한 수를 잘라줌
        for (int i=0;i<num.length();i++){
            list.add(num.substring(i,i+1));
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int i=0; i<list.size();i++){

            System.out.print(list.get(i));
        }
    }
}
