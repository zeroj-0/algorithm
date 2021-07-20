import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StringExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        //두 수를 받습니다
//        String number = sc.nextLine();
//        String number2 = sc.nextLine();
//
//        //받은 두 수를 쪼개서 각각의 배열에 넣어 줍니다!
//        List<String> around = new ArrayList<>();
//        List<String> around2 = new ArrayList<>();
//
//        //받은 두 수를 쪼개 줄겁니당
//        for (int i=0;i<3;i++){
//            String subString = number.substring(i,i+1);
//            around.add(subString);
//        }
//        for (int i=0;i<3;i++){
//            String subString = number2.substring(i,i+1);
//            around2.add(subString);
//        }
//
//        //거꾸로 읽는다고 해서 그 쪼갠수를 거꾸로 붙여줄껀데 StringBuffer로 역할을 해줍니다.
//        StringBuffer new_num = new StringBuffer();
//        StringBuffer new_num2 = new StringBuffer();
//
//        new_num.append(around.get(2)).append(around.get(1)).append(around.get(0)).toString();
//        new_num2.append(around2.get(2)).append(around2.get(1)).append(around2.get(0)).toString();
//
//        // 붙인 수를 int값으로 받아주겠습니당!
//        int new_number = Integer.parseInt(String.valueOf(new_num));
//        int new_number2 = Integer.parseInt(String.valueOf(new_num2));
//
//        //붙인 수의 크기를 비교하여 더 큰 것을 출력해주는 코드입니다!
//        if(new_number>new_number2) {
//            System.out.println(new_number);
//        }else if (new_number<new_number2){
//            System.out.println(new_number2);
//        }



        String word = sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(word);
        System.out.println(stringTokenizer.countTokens());

        //포기 .......
//        String word = sc.nextLine();
//        String[] alpabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        List<String> valueList = new ArrayList<>();
//        for (int i=0;i<word.length();i++){
//            String alpabetString = word.substring(i,i+1);
//            valueList.add(alpabetString);
//        }
//        System.out.println(valueList);
//        for (int i=0;i<valueList.size();i++){
//
//            if (valueList.get(i).equals("a")){
//                System.out.println(i);
//            }
//            else {
//                System.out.println("-1");
//            }
//
//        }






//        int alpa = sc.next().charAt(0);
//        System.out.println(alpa);



//        List<Integer> numberList = new ArrayList<>();
//
//        //N 숫자받음
//        int N = sc.nextInt();
//        //nextInt때문에 앞에 안들어가는거 들어가게 만들어주기 위함
//        sc.nextLine();
//
//        String numberString = sc.nextLine();
//        for (int i=0;i<N;i++){
//            String subString = numberString.substring(i,i+1);
//            numberList.add(Integer.parseInt(subString));
//        }
//
//        int sum = 0;
//        for (int i = 0; i < numberList.size(); i++) {
//                sum = sum + numberList.get(i);
//        }
//
//        System.out.println(sum);
    }
}
