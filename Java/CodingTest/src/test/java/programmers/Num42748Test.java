package programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.Num42748;

class Num42748Test {

    Num42748 solution = new Num42748();

    private class Case {
        int[] array;
        int[][] commands;
        int[] result;

        public Case(int[] array, int[][] commands, int[] result) {
            this.array = array;
            this.commands = commands;
            this.result = result;
        }
    }

    private final Case case1 = new Case(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}, new int[]{5, 6, 3});

    @Test
    void case1() {
        Assertions.assertThat(solution.solution(case1.array, case1.commands)).isEqualTo(case1.result);
    }
}