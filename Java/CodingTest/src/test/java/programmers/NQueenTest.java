package programmers;

import org.junit.jupiter.api.Test;
import programmers.NQueen;

import static org.assertj.core.api.Assertions.assertThat;

class NQueenTest {

    private NQueen solution = new NQueen();

    private class Case{
        int n, result;
        public Case(int n, int result) {
            this.n = n;
            this.result = result;
        }
    }

    private Case case1 = new Case(4, 2);
    private Case case2 = new Case(8, 92);

    @Test
    void case1() {
        assertThat(solution.mySolution(case1.n)).isEqualTo(case1.result);
    }

    @Test
    void case2() {
        assertThat(solution.mySolution(case2.n)).isEqualTo(case2.result);
    }
}