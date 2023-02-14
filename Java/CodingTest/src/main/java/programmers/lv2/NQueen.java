package programmers.lv2;

public class NQueen {
    boolean[] rowCheck, diagonalCheck1, diagonalCheck2;
    int inNum, count = 0;

    public int mySolution(int n) {
        this.inNum = n;
        this.rowCheck = new boolean[n];
        this.diagonalCheck1 = new boolean[(2 * n) - 1];
        this.diagonalCheck2 = new boolean[(2 * n) - 1];

        set(0);

        return count;
    }

    void set(int index) {
        for (int i = 0; i < inNum; i++) {

            if (rowCheck[i] || diagonalCheck1[i + index] || diagonalCheck2[i - index + inNum - 1]) {
                continue;
            }

            if (index == inNum - 1) count++;

            rowCheck[i] = diagonalCheck1[i + index] = diagonalCheck2[i - index + inNum - 1] = true;

            set(index + 1);

            rowCheck[i] = diagonalCheck1[i + index] = diagonalCheck2[i - index + inNum - 1] = false;
        }
    }
}
