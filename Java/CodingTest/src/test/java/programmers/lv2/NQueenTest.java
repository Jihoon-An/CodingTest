package programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NQueenTest {

    NQueen solution = new NQueen();

    class Case{
        int n, result;
        public Case(int n, int result) {
            this.n = n;
            this.result = result;
        }
    }

    Case case1 = new Case(4, 2);
    Case case2 = new Case(8, 92);

    @Test
    void case1() {
        assertThat(solution.mySolution(case1.n)).isEqualTo(case1.result);
    }

    @Test
    void case2() {
        assertThat(solution.mySolution(case2.n)).isEqualTo(case2.result);
    }
}