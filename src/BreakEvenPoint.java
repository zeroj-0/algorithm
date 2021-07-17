import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        //A : 고정비용 B: 가변비용 C: 노트북가격
        //총 수입 = 판매비용
        //총 비용 = 고정비용+가변비용
        //총 수입>총 비용이 되는 지점 => 손익분기점
        //손익분기점을 구하는 프로그램 작성

        //첫번재 줄!!!에 ABC가 빈칸을 사이에 두고 순서대로 입력 받음
        Scanner sc = new Scanner(System.in);

        int fixedCost = sc.nextInt(); // <-- 무조건 드는 애
        int variableCost = sc.nextInt(); // 노트북 하나 팔면 나오는 코스트.
        int notebookPrice = sc.nextInt(); // 노트북 팔면 생기는 수입


        // 노트북 하나 팔면 발생하는 비용 그리고 수입
        // variableCost >= notebookPrice --> -1

        //노트북 한개 생산하는데 A+B
        //10대 생산하면 A+B*갯수
        //판매비용

        //손익분기점이 발생한 판매량 출력
        //존재하지않으면 -1

        if (variableCost >= notebookPrice) {
            System.out.println("-1");
        } else {
            System.out.println(fixedCost / (notebookPrice - variableCost) + 1);
//            while (true) {
//                saledNoteBookCount++;
//                totalCost = fixedCost + (variableCost * saledNoteBookCount);
//                totalIncome = notebookPrice * saledNoteBookCount;
//                if (totalIncome > totalCost) {
//                    System.out.println(saledNoteBookCount);
//                    break;
//                }
//            }
        }
    }

}
