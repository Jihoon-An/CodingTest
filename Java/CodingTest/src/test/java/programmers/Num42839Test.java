package programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Num42839Test {

    Num42839 solution = new Num42839();

    private class Case {
        String numbers;
        int result;

        public Case(String numbers, int result) {
            this.numbers = numbers;
            this.result = result;
        }
    }

    private final Case case1 = new Case("17", 3);
    private final Case case2 = new Case("011", 2);
    private final Case case3 = new Case("123", 5);
    private final Case case4 = new Case("101", 2);
    private final Case case5 = new Case("001", 0);

    @Test
    void case1() {
        assertThat(solution.solution(case1.numbers)).isEqualTo(case1.result);
    }

    @Test
    void case2() {
        assertThat(solution.solution(case2.numbers)).isEqualTo(case2.result);
    }

    @Test
    void case3() {
        assertThat(solution.solution(case3.numbers)).isEqualTo(case3.result);
    }

    @Test
    void case4() {
        assertThat(solution.solution(case4.numbers)).isEqualTo(case4.result);
    }

    @Test
    void case5() {
        assertThat(solution.solution(case5.numbers)).isEqualTo(case5.result);
    }
}