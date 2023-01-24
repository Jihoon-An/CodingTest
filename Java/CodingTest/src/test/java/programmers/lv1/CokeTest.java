package programmers.lv1;

import org.junit.jupiter.api.*;
import programmers.lv1.coke.Coke;

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
            System.out.println(1);
            assertThat(
                    coke.mySolution1(2, 1, 20)
            ).isEqualTo(19);
        }

        @Test
        void case2() {
            System.out.println(2);
            assertThat(
                    coke.mySolution1(3, 1, 20)
            ).isEqualTo(9);
        }
    }

    @Nested
    @DisplayName("내 솔루션 2")
    class OtherSolution1Test {

        @Test
        void case1() {
            System.out.println(3);
            assertThat(
                    coke.otherSolution1(2, 1, 20)
            ).isEqualTo(19);
        }

        @Test
        void case2() {
            System.out.println(4);
            assertThat(
                    coke.otherSolution1(3, 1, 20)
            ).isEqualTo(9);
        }
    }

}
