package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Num42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int lw = 0;
        int[] legs = new int[bridge_length];
        int index = 0;

        do {
            // 다리 건너기 진행
            lw -= legs[bridge_length - 1];
            for (int i = bridge_length - 1; i > 0; i--) {
                legs[i] = legs[i - 1];
            }
            legs[0] = 0;

            // 신규 트럭 투입
            if (truck_weights[index] + lw <= weight) {
                legs[0] = truck_weights[index];
                lw += truck_weights[index];
                index++;
            }

            answer++;
        } while (index < truck_weights.length);
        answer += bridge_length;

        return answer;
    }
}
