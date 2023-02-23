package programmers;

import java.util.HashSet;
import java.util.Set;

public class Num42839 {
    private int answer = 0;
    private Set<Integer> numSet = new HashSet<>();
    private char[] chars;
    private int sLen = 0;

    public int solution(String numbers) {
        chars = numbers.toCharArray();
        sLen = chars.length;

        dfs(new int[sLen], 1);

        for (int num : numSet) if (check(num)) answer++;

        return answer;
    }

    private void dfs(int[] idxs, int idx) {
        int[] newIdxs = new int[sLen];

        for (int i = 0; i < sLen; i++) newIdxs[i] = idxs[i];

        for (int i = 0; i < sLen; i++) {
            if (newIdxs[i] == 0) {
                newIdxs[i] = idx;

                if (idx == sLen) {
                    for (int j = 1; j <= sLen; j++) {
                        StringBuffer sb = new StringBuffer();
                        for (int k = 0; k < j; k++) sb.append(chars[newIdxs[k] - 1]);
                        String str = sb.toString();
                        if (!str.equals("")) numSet.add(Integer.valueOf(str));
                    }

                    newIdxs[i] = 0;
                    return;
                }

                dfs(newIdxs, idx + 1);
                newIdxs[i] = 0;
            }
        }
    }

    private boolean check(int num) {

        int sqrt = (int) Math.sqrt(num);

        if (num < 2 || (num % 2 == 0 && num != 2)) return false;

        for (int i = 3; i <= sqrt; i += 2) if (num % i == 0) return false;

        return true;
    }
}
