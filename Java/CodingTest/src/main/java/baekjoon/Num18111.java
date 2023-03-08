package baekjoon;

import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/18111
// 미완
public class Num18111 {
    private static int N, M, B;
    private static int[][] field;

    public static int[] solution() {
        int[] answer = new int[2]; // 0: 시간, 1: 높이
        int[] heightCount = new int[257];
        Set<Integer> heightSet = new HashSet<>();
        int top = 256;
        int bottom = 0;

        for (int[] heights : field) {
            for (int height : heights) {
                heightCount[height]++;
                heightSet.add(height);
                if (top > height) top = height;
                if (bottom < height) bottom = height;
            }
        }

        PriorityQueue<Answer> answerPQ = new PriorityQueue<>(Comparator.comparingInt(Answer::getHeight));

        for (int i = bottom; i <= top; i++) {
            int time = 0;

            for (int height : heightSet) {
                if (height > i) {
                    time += (heightCount[height] - i) * 2;
                }
                if (height < i) {
                    time += i - heightCount[height];
                }
            }

            answerPQ.add(new Answer(time, i));
        }

        Answer result = answerPQ.poll();

        answer[0] = result.time;
        answer[1] = result.height;

        return answer;
    }

    static class Answer{
        int time;
        int height;

        public Answer(int time, int height) {
            this.time = time;
            this.height = height;
        }

        public int getTime() {
            return time;
        }

        public int getHeight() {
            return height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());
        B = Integer.parseInt(str.nextToken());

        field = new int[N][M];

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        br.close();

        int[] result = solution();

        for (int i = 0; i < 2; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
