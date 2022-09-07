import java.util.Scanner;

public class RecursiveFunctionExam {
    public static void main(String[] args) {

        // 교수님이 출력을 원하는 재귀 횟수를 입력받음
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 재귀 횟수에 따라 챗봇의 말이 반복된다.
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        for (int i = 0; i< num; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j<i; j++){
                sb.append("____");
            }
            System.out.println(sb.toString()+"\"재귀함수가 뭔가요?\"");
            System.out.println(sb.toString()+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(sb.toString()+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(sb.toString()+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
        }
        StringBuffer sb2 = new StringBuffer();
        for(int i=0; i< num; i++) {
            sb2.append("____");
        }
        System.out.println(sb2.toString()+"\"재귀함수가 뭔가요?\"");
        System.out.println(sb2.toString()+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");

        for(int i=num+1;i>0;i--) {
            System.out.println(sb2.toString()+"라고 답변하였지.");
            sb2.delete(0,4);
        }
    }
}
