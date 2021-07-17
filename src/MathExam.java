import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MathExam {
    public static void main(String[] args) {
        //A : 고정비용 B: 가변비용 C: 노트북가격
        //총 수입 = 판매비용
        //총 비용 = 고정비용+가변비용
        //총 수입>총 비용이 되는 지점 => 손익분기점
        //손익분기점을 구하는 프로그램 작성

        //첫번재 줄!!!에 ABC가 빈칸을 사이에 두고 순서대로 입력 받음
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(sc.nextLine());
        //" "에 따라 문자열 나눠줌
        String cost = sb.toString();
        String[] costValue = cost.split(" ");

        //나눠준 문자열 int값으로 받음
        List<Integer> biyong = new ArrayList<>();
        for (int i=0;i< costValue.length;i++) {
           biyong.add(Integer.parseInt(costValue[i]));
        }

        //노트북 한개 생산하는데 A+B
        //10대 생산하면 A+B*갯수
        //판매비용
        int totalCost;
        int totalIncome = 1;
        int j=0;

        //손익분기점이 발생한 판매량 출력
        //존재하지않으면 -1

        while (true) {
            j++;
            totalCost = biyong.get(0)+(biyong.get(1)*j);
            totalIncome = biyong.get(2)*j;
            if (totalIncome>totalCost){
                System.out.println(j);
                break;
            }
//            if ((totalIncome>totalCost) && (totalCost!=totalIncome)){
//                System.out.println(-1);
//                break;
//            }
        }


    }
}
