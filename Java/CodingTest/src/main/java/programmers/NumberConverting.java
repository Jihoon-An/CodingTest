package programmers;

import java.util.HashSet;
import java.util.Set;

public class NumberConverting {

    public int mySolution(int x, int y, int n) {

        int result = 1;
        int currentNode = x;
        Set<Integer> nodeSet = new HashSet<>();

        // 처음에 x 가 y랑 같으면 0 리턴
        if (x == y) {
            return 0;
        }

        // 처음 nodeSet 만들기
        // 연산 1
        currentNode = x + n;
        if (currentNode < y) {
            nodeSet.add(currentNode);
        } else if (currentNode == y) {
            return 1;
        }

        // 연산 2
        currentNode = x * 3;
        if (currentNode < y) {
            nodeSet.add(currentNode);
        } else if (currentNode == y) {
            return 1;
        }

        // 연산 3
        currentNode = x * 2;
        if (currentNode < y) {
            nodeSet.add(currentNode);
        } else if (currentNode == y) {
            return 1;
        }

        // nodeSet에서 node확장
        mainLoop:
        while (true) {
            result += 1;

            Set<Integer> newNodeSet = new HashSet<>();

            nodeSetLoop:
            for (int parentNode : nodeSet) {

                // 연산 1
                currentNode = parentNode + n;

                if (currentNode < y) {
                    newNodeSet.add(currentNode);
                } else if (currentNode == y) {
                    break mainLoop;
                }

                // 연산 2
                currentNode = parentNode * 3;

                if (currentNode < y) {
                    newNodeSet.add(currentNode);
                } else if (currentNode == y) {
                    break mainLoop;
                }

                // 연산 3
                currentNode = parentNode * 2;

                if (currentNode < y) {
                    newNodeSet.add(currentNode);
                } else if (currentNode == y) {
                    break mainLoop;
                }

            }

            // 새로 생긴 노드가 없다면 -1을 리턴
            if (newNodeSet.size() == 0) {
                return -1;
            }

            // nodeSet 최신화
            nodeSet = newNodeSet;
        }

        return result;
    }
}
