package hackerRank;

import java.util.Arrays;
import java.util.List;

public class WarmUp {

    /**
     * Alice와 Bob이 숫자의 범위가 1~100인 Array 두 개(a, b)를 받아서
     * 같은 인덱스마다 비교를 하여
     * 더 높은 숫자를 가진 쪽으로 점수를 부여한다.
     */
    public List<Integer> compareTheTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = Arrays.asList(0,0);

        for (int i = 0; i < a.size(); i++) {
            Integer aNum = a.get(i);
            Integer bNum = b.get(i);

            if (aNum > bNum) {
                result.set(0, result.get(0) + 1);
            }
            else if (aNum < bNum) {
                result.set(1, result.get(1) + 1);
            }
        }

        return result;
    }

    /**
     * Integer배열의 모든 값을 더해서 return.
     */
    public int SimpleArraySum(List<Integer> ar) {
        int result = 0;

        for (Integer num : ar) {
            result += num;
        }

        return result;
    }

    /**
     * 배열의 모든 요소의 합을 반환.
     */
    public long aVeryBigSum(List<Long> ar) {
        long result = 0;

        for (long num : ar) {
            result += num;
        }

        return result;
    }
}
