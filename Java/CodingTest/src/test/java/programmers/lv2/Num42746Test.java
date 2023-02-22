package programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num42746Test {

    Num42746 solution = new Num42746();

    private class Case {
        int[] numbers;
        String result;

        public Case(int[] numbers, String result) {
            this.numbers = numbers;
            this.result = result;
        }
    }

    private final Case case1 = new Case(new int[]{6, 10, 2}, "6210");
    private final Case case2 = new Case(new int[]{3, 30, 34, 5, 9}, "9534330");
    private final Case case3 = new Case(new int[]{54, 9, 45, 55, 56, 50, 547, 456, 1000}, "956555475450456451000");
    private final Case case4 = new Case(new int[]{0,0,0,0}, "0");
    private final Case case5 = new Case(new int[]{123, 1232}, "1232123");

    @Test
    void case1() {
        Assertions.assertThat(solution.solution(case1.numbers)).isEqualTo(case1.result);
    }

    @Test
    void case2() {
        Assertions.assertThat(solution.solution(case2.numbers)).isEqualTo(case2.result);
    }

    @Test
    void case3() {
        Assertions.assertThat(solution.solution(case3.numbers)).isEqualTo(case3.result);
    }

    @Test
    void case4() {
        Assertions.assertThat(solution.solution(case4.numbers)).isEqualTo(case4.result);
    }

    @Test
    void case5() {
        Assertions.assertThat(solution.solution(case5.numbers)).isEqualTo(case5.result);
    }
}