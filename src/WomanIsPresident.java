import java.util.Arrays;
import java.util.Scanner;

public class WomanIsPresident {
    public static void main(String[] args) {
        /**
         * 아파트 거주 조건
         * “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
         * 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때,
         * 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
         * 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
         */

        //TestCase 받음
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        //1<= n,k <= 14
        int[][] sweetHome = new int[15][15];


        //0층에서 1호 : 1명 | 2호 : 2명 | 3호 : 3명 | 4호 : 4명 ... i호 : i명
        //1층에서 1호 : 1명 | 2호 : 3명 | 3호 : 6명 | 4호 : 10명 ... i호 : ?
        //2층에서 1호 : 1명 | 2호 : 4명 | 3호 : 10명 | 4호 : 20명 ... i호 : ?
        //3층에서 1호 : 1명 | 2호 : 5명 | 3호 : 15명 | 4호 : 35명 ... i호 : ?

        //[][] 앞 인덱스는 층, 뒷 인덱스는 호
        for (int i=0;i<15;i++){
            sweetHome[0][i] = i;
            sweetHome[i][1] = 1;
        }

        //1층부터 쌓아올림
        for (int i=1;i<15;i++){
            //2호부터 더해줌
            for (int j=2;j<15;j++){
//                sweetHome[i][j] = sweetHome[i-1][j-1] + sweetHome[i-1][j];
                //위에처럼하면 다 밑층의 호수가 다 더해지는게 아님
                //해당 호수는 밑층의 해당호수와 해당층의 전호수의 명수를 더해야함
                sweetHome[i][j] = sweetHome[i][j-1] + sweetHome[i-1][j];
            }
        }

        //각각의 테스트 케이스 마다 첫번째 정수 k, 두번째 정수 n 받음
        //해당 집의 거주민 수 출력
        for (int i=0;i<tc;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(sweetHome[k][n]);
        }


    }
}
