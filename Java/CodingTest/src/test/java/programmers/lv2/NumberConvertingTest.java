package programmers.lv2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberConvertingTest {

    final NumberConverting solution = new NumberConverting();

    // case 1
    final int x1 = 10;
    final int y1 = 40;
    final int n1 = 5;
    final int result1 = 2;

    //case 2
    final int x2 = 10;
    final int y2 = 40;
    final int n2 = 30;
    final int result2 = 1;

    //case 3
    final int x3 = 2;
    final int y3 = 5;
    final int n3 = 4;
    final int result3 = -1;

    //case 4
    final int x4 = 10;
    final int y4 = 432;
    final int n4 = 13;
    final int result4 = 5;

    //case 5
    final int x5 = 8;
    final int y5 = 93;
    final int n5 = 15;
    final int result5 = 3;

    @Nested
    @DisplayName("내 솔루션 테스트")
    class MySolutionTest {
        @Test
        void case1() {
            assertThat(solution.mySolution(x1, y1, n1)).isEqualTo(result1);
        }

        @Test
        void case2() {
            assertThat(solution.mySolution(x2, y2, n2)).isEqualTo(result2);
        }

        @Test
        void case3() {
            assertThat(solution.mySolution(x3, y3, n3)).isEqualTo(result3);
        }

        @Test
        void case4() {
            assertThat(solution.mySolution(x4, y4, n4)).isEqualTo(result4);
        }

        @Test
        void case5() {
            assertThat(solution.mySolution(x5, y5, n5)).isEqualTo(result5);
        }
    }
}