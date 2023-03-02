package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Num154539 {
    int[] answer;
    int[] numbers;
    public int[] solution(int[] numbers) {
        this.numbers = numbers;
        int len = numbers.length;
        this.answer = new int[len];

        this.answer[len - 1] = -1;

        for (int i = len - 2; i >= 0; i--) {
            this.answer[i] = getBiggerNumIdx(this.numbers[i], i + 1);
        }

        for (int i = 0; i < len; i++) {
            if (answer[i] == -1) continue;
            this.answer[i] = this.numbers[this.answer[i]];
        }

        return this.answer;
    }
    private int getBiggerNumIdx(int num, int idx) {
        if (num < this.numbers[idx]) return idx;

        if (this.answer[idx] == -1) return -1;

        return getBiggerNumIdx(num, this.answer[idx]);
    }


    public int[] otherSolution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> s = new Stack<>();

        s.push(0);

        for (int i = 1; i < numbers.length; i++) {

            while (!s.isEmpty()) {
                int idx = s.pop();

                if (numbers[i] > numbers[idx]) { // 뒤가 더 클때
                    answer[idx] = numbers[i];
                } else { // 앞이 더 크거나 같을 때
                    s.push(idx);
                    break;
                }
            }

            s.push(i);
        }

        return answer;
    }
}