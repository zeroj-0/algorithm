import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //원하는 숫자 받음
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorial = 1;

        //팩토리얼 계산 함
        for (int i=num;i>=1;i--){
            factorial = factorial*i;
        }

        System.out.println(factorial);


    }
}
