package learn;

import java.util.Scanner;

public class NumberController { // 클래스명은 명사
    public int control(int oldNumber) {
        int sumOfnumber = oldNumber % 10 + oldNumber / 10;

        // 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙인다.
        int rightSumOfnumber = sumOfnumber % 10;
        int rightNumber = oldNumber % 10;

        int newNumber = rightNumber * 10 + rightSumOfnumber % 10;
        return newNumber;
    }
}
