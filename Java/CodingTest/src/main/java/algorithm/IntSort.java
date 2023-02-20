package algorithm;

import java.util.Scanner;

public class IntSort {

    // 힙 정렬
    static void heapSort(int[] a) {
        int n = a.length;

        for (int i = (n - 2) / 2; i >= 0; i--)
            HeapSort.downHeap(a, i, n - 1);

        for (int i = n - 1; i > 0; i--) {
            HeapSort.swap(a, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환.
            HeapSort.downHeap(a, 0, i - 1); // a[0] ~ a[i-1]을 힙으로 만듬.
        }
    }

    private static class HeapSort {

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
    }

    // 도수정렬
    static void fSort(int[] a) {
        int n = a.length;

        // 최댓값 구하기
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if(a[i] > max) max = a[i];
        }

        int[] f = new int[max + 1]; // 분포표
        int[] b = new int[n];       // 복사용 임시 배열

        // 도수분포표 만들기
        for (int i = 0; i < n; i++) f[a[i]]++;
        // 누적도수분포표 만들기
        for (int i = 1; i <= max; i++) f[i] += f[i - 1];
        // 목적 배열 만들기
        for (int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i];
        // 배열 복사하기
        for (int i = 0; i < n; i++) a[i] = b[i];
    }


}
