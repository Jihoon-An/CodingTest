package programmers;

import org.junit.jupiter.api.*;
import programmers.Coke;

import static org.assertj.core.api.Assertions.assertThat;


public class CokeTest {

    private static Coke coke;

    @BeforeAll
    static void before() {
        coke = new Coke();
    }

    @Nested
    @DisplayName("내 솔루션 1")
    class MySolution1Test {

        @Test
        void case1() {
            assertThat(
                    coke.mySolution1(2, 1, 20)
            ).isEqualTo(19);
        }

        @Test
        void case2() {
            assertThat(
                    coke.mySolution1(3, 1, 20)
            ).isEqualTo(9);
        }

        @Test
        void case3() {
            assertThat(
                    coke.mySolution1(3, 1, 50)
            ).isEqualTo(24);
        }
    }

    @Nested
    @DisplayName("내 솔루션 2")
    class MySolution2Test {

        @Test
        void case1() {
            assertThat(
                    coke.mySolution2(2, 1, 20)
            ).isEqualTo(19);
        }

        @Test
        void case2() {
            assertThat(
                    coke.mySolution2(3, 1, 20)
            ).isEqualTo(9);
        }
        @Test
        void case3() {
            assertThat(
                    coke.mySolution2(3, 1, 50)
            ).isEqualTo(24);
        }
    }

    @Nested
    @DisplayName("다른 사람의 솔루션 1")
    class OtherSolution1Test {

        @Test
        void case1() {
            assertThat(
                    coke.otherSolution(2, 1, 20)
            ).isEqualTo(19);
        }

        @Test
        void case2() {
            assertThat(
                    coke.otherSolution(3, 1, 20)
            ).isEqualTo(9);
        }

        @Test
        void case3() {
            assertThat(
                    coke.otherSolution(3, 1, 50)
            ).isEqualTo(24);
        }
    }

}
