import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayExam {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] num = new int[10];
//        int[] remainder = new int[10];
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < 10; i++) {
//            num[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            remainder[i] = num[i] % 42;
//            set.add(remainder[i]);
//        }
//        System.out.println(set.size());

        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        for (int i=1;i<10;i++){
            int num = sc.nextInt();
            number[i] = num;
        }
        int max=number[0];
        for (int i=1;i<10;i++){
            if (number[i]>max){
                max=number[i];
            }
            else if (number[i]<max){
                max=max;
            }
        }
        System.out.println(max);
        for (int i=1;i<10;i++){
            if(number[i] == max){
                System.out.println(i);
            }
        }


    }
}



