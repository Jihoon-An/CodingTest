package algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest {

    class Case1 {
        List<Integer> inputArr = Arrays.asList(1, 3, 5, 14, 27, 42, 65);
        int key = 27;
        int result = 4;
    }

    Case1 case1 = new Case1();

    @Nested
    @DisplayName("선형 탐색 테스트")
    class LinearSearchTest {
        @Test
        void case1() {
            int result = Search.linear(case1.inputArr, case1.key);
            assertThat(result).isEqualTo(case1.result);
        }
    }

    @Nested
    @DisplayName("이진 배열 탐색 테스트")
    class binArrSearchTest {
        @Test
        void case1() {
            int result = Search.binArr(case1.inputArr, case1.key);
            assertThat(result).isEqualTo(case1.result);
        }
    }

}
