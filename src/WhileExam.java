import java.io.IOException;
import java.util.*;

public class WhileExam {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = num1+num2;
        list.add(total);

        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        if (N<10) {
//
//        }


    }
}
