package others;

import java.io.*;
import java.util.*;

public class EulerQuiz5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        input = input.replace(",", " ");
        StringTokenizer st = new StringTokenizer(input);
        int len = st.countTokens();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(solution(list));
    }

    public static int solution(List inList){
        int len = inList.size();
        if (len < 2) {
            return -1;
        }
        int num1 = 0, num2 = 0;

        Collections.sort(inList);

        int lastZeroIndex = inList.lastIndexOf(0);

        if(lastZeroIndex > -1){
            if (lastZeroIndex + 2 >= len) {
                return -1;
            }
            int index1 = lastZeroIndex + 1;
            int index2 = lastZeroIndex + 2;

            inList.set(0, inList.get(index1));
            inList.set(1, inList.get(index2));
            inList.set(index1, 0);
            inList.set(index2, 0);
        }

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) { // 0 or 짝수 번째
                num1 += (int) inList.get(i) * Math.pow(10, (len -1 - i) / 2);
            }
            else { // 홀수 번째
                num2 += (int) inList.get(i) * Math.pow(10, (len -1 - i) / 2);
            }
        }

        return num1 + num2;
    }
}
