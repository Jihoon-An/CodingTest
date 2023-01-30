package algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber solution = new PrimeNumber();

    @Nested
    class getPrimeNumberTest {
        @Test
        void case1() {
            List primeNumList = solution.getPrimeNumber(11);

            Assertions.assertThat(primeNumList.size()).isEqualTo(5);
        }

        @Test
        void case2() {
            List primeNumList = solution.getPrimeNumber(15);

            Assertions.assertThat(primeNumList.size()).isEqualTo(6);
        }

        @Test
        void case3() {
            List primeNumList = solution.getPrimeNumber(20);

            Assertions.assertThat(primeNumList.size()).isEqualTo(8);
        }
    }
}