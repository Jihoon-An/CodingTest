package programmers;

import java.util.ArrayList;
import java.util.List;

public class Num154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        answer[numbers.length - 1] = -1;

        int num = -1;

//        for (int i = numbers.length - 1; i > 0; i--) {
//            if (numbers[i - 1] >= numbers[i]) {
//                answer[i - 1] = num;
//                continue;
//            }
//
//        }

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] < numbers[i + 1]) {
                answer[i] = numbers[i + 1];
            } else if (numbers[i] < answer[i + 1]) {
                answer[i] = answer[i + 1];
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
