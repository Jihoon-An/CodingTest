package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num42840 {
    public List<Integer> solution(int[] answers) {

        int[][] players = new int[][] {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int[] results = new int[3];

        int max = 0;

        for(int i = 0; i < 3; i++){
            int[] player = players[i];

            int j = 0;
            int cnt = 0;

            for(int answer : answers){
                if(answer == player[j]){
                    cnt++;
                }

                if(player.length == ++j){
                    j = 0;
                }
            }

            if(cnt > max){
                max = cnt;
            }

            results[i] = cnt;
        }

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            if(results[i] == max){
                answer.add(i+1);
            }
        }

        return answer;
    }
}
