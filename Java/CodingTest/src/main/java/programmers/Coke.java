package programmers;

public class Coke {

    public int mySolution1(int a, int b, int n) {
        int newCoke = 0;
        int currentCoke = n;

        while (true) {

            // 1. n(currentCoke)을 a로 나누어 몫을 b에 곱한 값을 addCoke로 지정.
            int addCoke = currentCoke / a * b;
            int remainder = currentCoke % a;

            // 2. addCoke를 이용하여 newCoke, currentCoke를 최신화.
            newCoke += addCoke;
            currentCoke = addCoke + remainder;

            // 3. currnetCoke를 사용하여 1,2번을 반복.
            if (currentCoke >= a) {
                continue;
            }

            // 4. currentCoke가 a보다 작아질 때 반복문을 탈출하고, newCoke를 반환한다.
            break;
        }

        return newCoke;
    }

    public int mySolution2(int a, int b, int n) {
        return (int) (n * b / a * (Math.pow((b / a), Math.ceil(Math.log(n) / Math.log(a / b))) - 1) / ((b / a) - 1));
    }

    public int otherSolution(int a, int b, int n) {
        return (n - b) / (a - b) * b;
    }
}