import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        //테스트 케이스의 갯수 받기
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        //nextInt()때문에 한줄 더 띄워주기
        sc.nextLine();

        //O X로만 이루어진 문자열 받기
        //문자열 쪼개서 list에 넣어줌

        String[] oxValue = new String[testcase];

        for (int i=0;i<testcase;i++){
            String ox = sc.nextLine();
            oxValue[i] = ox;
        }
        for (int i=0;i<testcase;i++) {
            //list를 for문안에 선언함으로서 새로운 list 계속 선언됨
            List<String> oxQuiz = new ArrayList<>();
            int result =0;
            int score = 0;
            for (int j = 0; j < oxValue[i].length(); j++) {
                oxQuiz.add(oxValue[i].substring(j, j + 1));
                if (oxQuiz.get(j).equals("O")){
                    score++;
                    result+=score;
                }
                else {
                    score=0;
                }
            }
//            System.out.println(oxQuiz);
            System.out.println(result);
        }



        //처음 배열안에 있는 문자열의 길이만큼 리스트에서 잘라주고 싶은데 어찌해야할지 모르겠습니더!!!!!!!!

        //연속된 O값이 있으면 점수올라감(hasNext..?)



    }
}

