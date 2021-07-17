import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        //다이얼을 걸기 위한 최소시간 출력
        //숫자 1은 2초 필요
        //숫자 한칸씩 갈때마다 1초씩 더 걸림
        //abc: 2, def: 3, ghi: 4, jkl: 5, mno:6, pqrs:7, tuv: 8, wxyz:9
        //operator: 0

        //다이얼 입력을 위한 단어 입력 받음
        Scanner sc = new Scanner(System.in);
        String dialWord = sc.nextLine();

        //2는 3초, 3은 4초, 4는 5초, 5는 6초, 6은 7초, 7은 8초, 8은 9초, 9는 10초, 0은 11초

        int time = 0;
        //contains을 이용하여 입력받은 String값이랑 다이얼의 알파벳이랑 비교해줍니다.
        String[] num2 = new String[]{"A","B","C"};
        String[] num3 = new String[]{"D","E","F"};
        String[] num4 = new String[]{"G","H","I"};
        String[] num5 = new String[]{"J","K","L"};
        String[] num6 = new String[]{"M","N","O"};
        String[] num7 = new String[]{"P","Q","R","S"};
        String[] num8 = new String[]{"T","U","V"};
        String[] num9 = new String[]{"W","X","Y","Z"};

        for (int i=0;i<dialWord.length();i++) {
            boolean result2 = dialWord.contains(num2[i]);
            boolean result3 = dialWord.contains(num3[i]);
            boolean result4 = dialWord.contains(num4[i]);
            boolean result5 = dialWord.contains(num5[i]);
            boolean result6 = dialWord.contains(num6[i]);
            boolean result7 = dialWord.contains(num7[i]);
            boolean result8 = dialWord.contains(num8[i]);
            boolean result9 = dialWord.contains(num9[i]);


            if (result2 == true) {
                time = time + 3;
            }
            if (result3 == true){
                time = time + 4;
            }
            if (result4 == true){
                time = time + 5;
            }
            if (result5 == true){
                time = time + 6;
            }
            if (result6 == true){
                time = time + 7;
            }
            if (result7 ==true){
                time = time + 8;
            }
            if (result8 == true){
                time = time + 9;
            }
            if (result9 == true){
                time = time + 10;
            }

        }
        System.out.println(time);
//        //입력받은 단어 쪼개줍니다. 그리고 배열에 넣어주겠습니다.
//        String[] dialNum = new String[dialWord.length()];
//        for (int i=0;i<dialWord.length();i++) {
//            String dial = dialWord.substring(i,i+1);
//            dialNum[i] = dial;
//        }
//        System.out.println(Arrays.toString(dialNum));
//        Map<String, String> dialmap = new HashMap<>();
//
//
//        //다이얼 배열에 넣어주도록 합니다.
//        String[] num2 = new String[]{"A","B","C"};
//        String[] num3 = new String[]{"D","E","F"};
//        String[] num4 = new String[]{"G","H","I"};
//        String[] num5 = new String[]{"J","K","L"};
//        String[] num6 = new String[]{"M","N","O"};
//        String[] num7 = new String[]{"P","Q","R","S"};
//        String[] num8 = new String[]{"T","U","V"};
//        String[] num9 = new String[]{"W","X","Y","Z"};
//        String[] num0 = new String[]{"OPERATOR"};


//
//        //시간 데이터 초기화
//        int time = 0;
//        int totalTime = 0;
//
//        //넣은 배열과 시간을 맞춰주겠습니다
//        for (int i=0;i<dialWord.length();i++){
//            boolean result2 = Arrays.asList(num2).contains(dialNum[i]);
//            boolean result3 = Arrays.asList(num3).contains(dialNum[i]);
//            boolean result4 = Arrays.asList(num4).contains(dialNum[i]);
//            boolean result5 = Arrays.asList(num5).contains(dialNum[i]);
//            boolean result6 = Arrays.asList(num6).contains(dialNum[i]);
//            boolean result7 = Arrays.asList(num7).contains(dialNum[i]);
//            boolean result8 = Arrays.asList(num8).contains(dialNum[i]);
//            boolean result9 = Arrays.asList(num9).contains(dialNum[i]);
//            boolean result0 = Arrays.asList(num0).contains(dialNum[i]);
//
//            if (result2 = true){
//                time = time + 3;
//            }
//            if (result3 = true){
//                time = time + 4;
//            }
//            if (result4 = true){
//                time = time + 5;
//            }
//            if (result5 = true){
//                time = time + 6;
//            }
//            if (result6 = true){
//                time = time + 7;
//            }
//            if (result7 = true){
//                time = time + 8;
//            }
//            if (result8 = true){
//                time = time + 9;
//            }
//            if (result9 = true){
//                time = time + 10;
//            }
//
//
//
//
//
//        }
//        System.out.println(time);

        /**어흑흑흐그흐긓극그극ㅎㄱ
         * 죽어라 풀었는데
         * 인터넷은 너무 쉽게푸네 시발
         * 너무 열받는군
         * switch...당신 내가 생각지도 못했어
         * 뒷통수를 제대로 때려버렸어 ............
         *
         * Scanner sc = new Scanner(System.in);
         *
         * 		String stringWord = sc.nextLine();
         *
         * 		int time = 0;
         * 		int k = stringWord.length();
         *
         * 		for(int i = 0; i < k; i++) {
         *
         * 			switch(stringWord.charAt(i)) {
         *
         * 			case 'A' : case 'B': case 'C' :
         * 				time += 3;
         * 				break;
         *
         * 			case 'D' : case 'E': case 'F' :
         * 				time += 4;
         * 				break;
         *
         * 			case 'G' : case 'H': case 'I' :
         * 				time += 5;
         * 				break;
         *
         * 			case 'J' : case 'K': case 'L' :
         * 				time += 6;
         * 				break;
         *
         * 			case 'M' : case 'N': case 'O' :
         * 				time += 7;
         * 				break;
         *
         * 			case 'P' : case 'Q': case 'R' : case 'S' :
         * 				time += 8;
         * 				break;
         *
         * 			case 'T' : case 'U': case 'V' :
         * 				time += 9;
         * 				break;
         *
         * 			case 'W' : case 'X': case 'Y' : case 'Z' :
         * 				time += 10;
         * 				break;
         *                        }*
         *                }
         * 		System.out.print(time);
         *
         *      ㅌ..ㅌ탙.ㅌ.탙닥...코딩...시발럼아...ㅌ..ㅌ탙ㄱ...탁
         */
    }
}
