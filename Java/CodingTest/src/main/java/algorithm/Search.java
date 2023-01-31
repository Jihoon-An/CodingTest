package algorithm;

import java.util.List;

public class Search {

    /**
     * integer인 List에서 key가 있는 index를 선형검색을 사용해서 찾음.
     *
     * @param arr 찾을 리스트
     * @param key 찾는 값
     * @return key가 있다면 index, 없으면 -1을 반환.
     */
    public static int linear(List<Integer> arr, int key) {
        // 리스트의 사이즈가 0이면 바로 -1 리턴.
        if (arr.size() == 0) {
            return -1;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                return i;
            }
        }

        return -1;
    }

    /**
     * integer인 List에서 key가 있는 index를 이진 배열 탐색을 사용해서 찾음.
     * @param arr 찾을 리스트
     * @param key 찾는 값
     * @return key가 있다면 index, 없으면 -1을 반환.
     */
    public static int binArr(List<Integer> arr, int key) {
        // 리스트의 사이즈가 0이면 바로 -1 리턴.
        if (arr.size() == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.size() - 1;

        while (true) {
            int x = (right + left) / 2;
            // 값 비교
            int crtNum = arr.get(x);

            // 결과 처리
            if (crtNum == key) {
                return x;
            }

            if (crtNum > key) {
                right = x - 1;

            }else {  // crtNUm < key
                left = x + 1;
            }

            // 더 이상 탐색할 범위가 없으면 -1 리턴.
            if (left > right) {
                return -1;
            }
        }
    }
}
