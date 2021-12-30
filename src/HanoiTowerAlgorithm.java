import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTowerAlgorithm {
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // 원판의 갯수 받음
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        // 원판의 이동횟수는 2^n - 1 출력
        stringBuilder.append((int) (Math.pow(2, N) - 1)).append('\n');

        // 기둥 A, B, C가 있음
        HanoiTower(N, 1, 2, 3);
        System.out.println(stringBuilder.toString());
    }

    private static void HanoiTower(int N, int A, int B, int C) {
        if (N == 1){
            stringBuilder.append(A+" "+C+"\n");
            return;
        }

        // 기둥을 A에서 B로 이동
        HanoiTower(N-1, A, C, B);

        stringBuilder.append(A+" "+C+"\n");

        // 기둥을 B에서 C로 이동
        HanoiTower(N-1, B, A, C);
    }
}
