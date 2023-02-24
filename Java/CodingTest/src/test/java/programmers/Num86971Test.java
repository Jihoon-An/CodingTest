package programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Num86971Test {

    Num86971 solution = new Num86971();

    @Test
    void solution() {
        Assertions.assertThat(solution.solution(
                        9,
                        new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})
                )
                .isEqualTo(3);
    }
}