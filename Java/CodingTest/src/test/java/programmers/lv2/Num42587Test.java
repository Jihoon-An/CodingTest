package programmers.lv2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Num42587Test {

    private final Num42587 solution = new Num42587();

    private final class Case {
        int[] priorities;
        int location;
        int result;

        public Case(int[] priorities, int location, int result) {
            this.priorities = priorities;
            this.location = location;
            this.result = result;
        }
    }

    private final Case case1 = new Case(new int[]{2, 1, 3, 2}, 2, 1);
    private final Case case2 = new Case(new int[]{1, 1, 9, 1, 1, 1}, 0, 5);
    private final Case case3 = new Case(new int[]{2, 5, 7, 3, 5, 7, 8, 4, 1}, 5, 3);

    @Nested
    class solutionTest {
        @Test
        void case1() {
            assertThat(solution.solution(case1.priorities, case1.location))
                    .isEqualTo(case1.result);
        }

        @Test
        void case2() {
            assertThat(solution.solution(case2.priorities, case2.location))
                    .isEqualTo(case2.result);
        }

        @Test
        void case3() {
            assertThat(solution.solution(case3.priorities, case3.location))
                    .isEqualTo(case3.result);
        }

    }
}