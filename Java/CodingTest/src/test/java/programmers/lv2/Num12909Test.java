package programmers.lv2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Num12909Test {
    private final Num12909 solution = new Num12909();

    private final class Case{
        String inputStr;
        boolean result;

        public Case(String inputStr, boolean result) {
            this.inputStr = inputStr;
            this.result = result;
        }
    }

    private final Case case1 = new Case("()()", true);
    private final Case case2 = new Case("(())()", true);
    private final Case case3 = new Case(")()(", false);
    private final Case case4 = new Case("(()(", false);
    private final Case case5 = new Case("", true);


    @Nested
    class SolutionTest {
        @Test
        void case1() {
            assertThat(solution.solution(case1.inputStr)).isEqualTo(case1.result);
        }
        @Test
        void case2() {
            assertThat(solution.solution(case2.inputStr)).isEqualTo(case2.result);
        }
        @Test
        void case3() {
            assertThat(solution.solution(case3.inputStr)).isEqualTo(case3.result);
        }
        @Test
        void case4() {
            assertThat(solution.solution(case4.inputStr)).isEqualTo(case4.result);
        }
        @Test
        void case5() {
            assertThat(solution.solution(case5.inputStr)).isEqualTo(case5.result);
        }
    }
}