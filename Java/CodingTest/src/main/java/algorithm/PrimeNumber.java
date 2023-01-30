package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /**
     * <h2>maxNum 보다 작거나 같은 소수(prime number)를 List로 만들어 반환함.</h2>
     * 소수임을 판단하는 연산을 하는 수의 제곱근 보다 큰 수는 약수의 계산이 중복이 있기 때문에,
     * 제곱근 보다 큰 소수는 계산하지 않으므로, 계산 시간을 줄인다.
     *
     * @param maxNum 1보다 큰 수를 입력해야 한다.
     * @return
     */
    public List<Integer> getPrimeNumber(int maxNum) {

        List<Integer> primeNumList = new ArrayList<>();

        // maxNum이 1 이하의 수이면 바로 리턴.
        if (maxNum <= 1) {
            return primeNumList;
        }

        // maxNum이 2면 2만 넣어서 return
        if (maxNum == 2) {
            primeNumList.add(2);

            return primeNumList;
        }

        mainLoop:
        for (int currentNum = 3; currentNum <= maxNum; currentNum += 2) {
            // currentNum의 제곱근
            int square = (int) Math.sqrt(currentNum);

            // 기존의 소수들로 currentNum에 대해 연산
            for (int primeNum : primeNumList) {
                if (primeNum > square) {
                    break;
                }

                if (currentNum % primeNum == 0) {
                    continue mainLoop;
                }
            }

            primeNumList.add(currentNum);
        }

        // 위에서 홀수만 계산하기 때문에, 연산 수 최적화를 위해 마지막에 추가.
        primeNumList.add(0, 2);

        return primeNumList;
    }

}
