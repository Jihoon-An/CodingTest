package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Num42746 {
    public String solution(int[] numbers) {
        StringBuffer result = new StringBuffer();

        List<Num> numList = new ArrayList<>();

        for (int number : numbers) {
            numList.add(new Num(number));
        }

        Collections.sort(numList, new NumComparator());

        for (Num num : numList) {
            result.append(num.str);
        }

        String answer = result.toString();

        if (answer.startsWith("0")) {
            int end = 0;

            for (int i = 0; i < answer.length() - 1; i++) {
                end = i;
                if (answer.charAt(i) != '0') {
                    break;
                }
            }

            answer = answer.substring(end + 1);
        }

        if (answer.equals("")) {
            return "0";
        }

        return answer;
    }

    private class Num {
        int val;
        String str;

        public Num(int val) {
            this.str = String.valueOf(val);
            this.val = Integer.valueOf((str + str + str + str).substring(0, 4));
        }
    }

    private class NumComparator implements Comparator<Num> {
        @Override
        public int compare(Num n1, Num n2) {
            return n2.val - n1.val;
        }
    }
}
