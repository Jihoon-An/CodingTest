package algorithm;

import java.util.Scanner;

public class ListSort {

    // Heap정렬
    static class HeapSort {

        static void swap(int[] a, int idx1, int idx2) {
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        }

        // a[left] ~ a[right]를 힙으로 만듬
        static void downHeap(int[] a, int left, int right) {
            int temp = a[left]; // 루트
            int child;          // 큰 값을 가진 노드
            int parent;         // 부모

            for (parent = left; parent < (right + 1) / 2; parent = child) {
                // 왼쪽 자식, 오른쪽 자식 중에 큰 자식을 선별
                int cl = parent * 2 + 1;    // 왼쪽 자식
                int cr = cl + 1;            // 오른쪽 자식
                child = (cr <= right && a[cr] > a[cl]) ? cr : cl;   // 왼쪽, 오른쪽 중에 큰 값을 가진 노드를 자식에 대입

                // 자식이 부모보다 크면 자식을 부모로 변경.
                if (temp >= a[child]) break;
                a[parent] = a[child];
            }

            // temp 위치 지정 (for문이 break없이 전부 실행하면, parent = child를 실행하므로 parent 위치에 temp를 넣는 것이 맞음)
            a[parent] = temp;
        }

        // 힙 정렬
        static void heapSort(int[] a, int n) {
            for (int i = (n - 2) / 2; i >= 0; i--)
                downHeap(a, i, n - 1);

            for (int i = n - 1; i > 0; i--) {
                swap(a, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환.
                downHeap(a, 0, i - 1); // a[0] ~ a[i-1]을 힙으로 만듬.
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        HeapSort.heapSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
