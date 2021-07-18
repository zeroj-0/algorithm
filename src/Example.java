import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        System.out.println("강한친구 대한육군");
//        System.out.println("강한친구 대한육군");

//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");

//        System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");

        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        System.out.println(A+B);
//        System.out.println(A-B);
//        System.out.println(A*B);
//        System.out.println(A/B);
//        System.out.println(A%B);

//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        System.out.println((A+B)%C);
//        System.out.println(((A%C) + (B%C))%C);
//        System.out.println((A*B)%C);
//        System.out.println(((A%C) * (B%C))%C);
        int firstNumber = sc.nextInt();
        sc.nextLine();
        String secondNumber = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        String[] stringNumber = new String[3];
        for (int i=0;i<secondNumber.length();i++) {
           stringNumber[i] = secondNumber.substring(i, i + 1);
        }
        int[] numberArray = new int[stringNumber.length];

        for (int i=0;i<stringNumber.length;i++){
            numberArray[i] = Integer.parseInt(stringNumber[i]);
        }
        System.out.println(firstNumber*numberArray[2]);
        System.out.println(firstNumber*numberArray[1]);
        System.out.println(firstNumber*numberArray[0]);

        System.out.println((firstNumber*numberArray[0]*100)+(firstNumber*numberArray[1]*10)+(firstNumber*numberArray[2]));
    }
}
