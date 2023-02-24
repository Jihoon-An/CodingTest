package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Num86971 {
    public int solution(int n, int[][] connections) {

        int min = n;

        Map<Integer, Set<Integer>> wireConnections = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            wireConnections.put(i, new HashSet<>());
        }

        // 연결 만들기
        for (int[] connection : connections) {
            wireConnections.get(connection[0]).add(connection[1]);
            wireConnections.get(connection[1]).add(connection[0]);
        }

        for (int i = 0; i < n - 1; i++) {
            int[] counts = getDividedConnectionCount(wireConnections, connections[i]);
            if (counts[0] + counts[1] == n) {
                int dif = Math.abs(counts[1] - counts[0]);
                if (dif < min) {
                    min = dif;
                }
            }
        }

        return min;
    }

    private int[] getDividedConnectionCount(Map<Integer, Set<Integer>> wireConnections, int[] disconnect) {
        int[] result = new int[2];

        // 연결 끊기
        wireConnections.get(disconnect[0]).remove(disconnect[1]);
        wireConnections.get(disconnect[1]).remove(disconnect[0]);

        // 개수 확인
        Set<Integer> connection = new HashSet<>();

        putConnection(wireConnections, connection, disconnect[0]);
        result[0] = connection.size();

        connection = new HashSet<>();

        putConnection(wireConnections, connection, disconnect[1]);
        result[1] = connection.size();

        // 복구
        wireConnections.get(disconnect[0]).add(disconnect[1]);
        wireConnections.get(disconnect[1]).add(disconnect[0]);

        return result;
    }

    private void putConnection(Map<Integer, Set<Integer>> wireConnections, Set<Integer> connection, int nodeNum) {
        if (connection.contains(nodeNum)) return;

        connection.add(nodeNum);

        Set<Integer> wires = wireConnections.get(nodeNum);

        if (wires.size() == 0) {
            return;
        }

        for (int wire : wires) {
            if (!connection.contains(wire)) {
                putConnection(wireConnections, connection, wire);
            }
        }
    }
}
