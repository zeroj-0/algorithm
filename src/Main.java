import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        List<Integer> inputValue = new ArrayList<>();
        List<Integer> outputValue = new ArrayList<>();

        for (int i=0;i<N;i++) {
            int num = sc.nextInt();
            inputValue.add(num);
        }

        for (int i=0;i<inputValue.size();i++){

            if(inputValue.get(i)<X) {
                outputValue.add(inputValue.get(i));
            }
        }
        System.out.println(outputValue);
        for (int i=0;i<outputValue.size();i++){
            System.out.print(outputValue.get(i)+" ");
        }
    }
}
