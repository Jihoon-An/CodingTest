package algorithm;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IntSortTest {

    int[] x;    // 정렬할 배열

    @BeforeEach
    void beforeEach() {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        stdIn.close();
    }

    @Test
    void heapSortTest() {
        IntSort.heapSort(x);
    }

    @Test
    void fSortTest() {
        IntSort.fSort(x);
    }

    @AfterEach
    void afterEach() {
        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}