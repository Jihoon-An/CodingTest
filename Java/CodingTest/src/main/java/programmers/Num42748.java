package programmers;

import java.util.Arrays;
public class Num42748 {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLen = commands.length;
        int[] answer = new int[commandsLen];

        for(int i = 0; i < commandsLen; i++){
            answer[i] = subSort(array, commands[i][0], commands[i][1])[commands[i][2] - 1];
        }

        return answer;
    }

    private int[] subSort(int[] arr, int start, int end){
        int len = end - start + 1;
        int[] subArr = new int[len];

        for(int i = 0; i < len; i++){
            subArr[i] = arr[i + start - 1];
        }
        Arrays.sort(subArr);
        return subArr;
    }
}
