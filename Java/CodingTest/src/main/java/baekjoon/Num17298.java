package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 오큰수 구하기
 * 알고리즘 코딩 테스트 Java 문제풀이
 * - Stack
 */

public class Num17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] ans = new int[n];
        String[] str = br.readLine().split(" ");
        br.close();

        for (int i = 0; 0 < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();

        myStack.push(0);

        for (int i = 1; i < n; i++) {
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        while (!myStack.empty()) {
            ans[myStack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
