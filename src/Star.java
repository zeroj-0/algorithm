import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            for (int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                String star = "";
                star = star + "*";
                System.out.print(star);
            }
            System.out.println("");
        }
    }
}
// ____* _4개 *1개
// ___** _3개 *2개
// __*** _2개 *3개
// _**** _1개 *4개
// ***** _0개 *5개
