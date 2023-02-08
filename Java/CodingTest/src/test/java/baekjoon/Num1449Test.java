package baekjoon;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Num1449Test {

    @Nested
    class MySolutionTest {
        @Test
        void case1() {
            assertThat(Num1449.mySolution(2, new int[]{1,2,100,101})).isEqualTo(2);
        }
        @Test
        void case2() {
            assertThat(Num1449.mySolution(3, new int[]{1,2,3,4})).isEqualTo(2);
        }
        @Test
        void case3() {
            assertThat(Num1449.mySolution(1, new int[]{3,2,1})).isEqualTo(3);
        }
    }
}