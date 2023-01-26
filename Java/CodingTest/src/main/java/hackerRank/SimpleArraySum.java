package hackerRank;

import java.util.List;

/**
 * Integer배열의 모든 값을 더해서 return.
 */
public class SimpleArraySum {
    public int mySolution1(List<Integer> ar) {
        int result = 0;

        for (Integer num : ar) {
            result += num;
        }

        return result;
    }
}
