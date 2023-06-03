package km;

import java.util.ArrayList;
import java.util.List;

public class KmTest1 {
    static private List<List<Integer>> graph;
    static private boolean[] visited;

    public static boolean solution(int N, int[] A, int[] B) {
        // Create an adjacency list representation of the graph
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < A.length; i++) {
            int u = A[i];
            int v = B[i];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Initialize the visited array
        visited = new boolean[N + 1];

        // Start DFS from vertex 1
        return dfs(1, 1, N);
    }

    private static boolean dfs(int current, int count, int target) {
        if (current == target && count == target) {
            // Reached the target vertex and visited all vertices
            return true;
        }

        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (neighbor == count + 1) {
                    // Recurse to the next vertex in increasing order
                    if (dfs(neighbor, count + 1, target)) {
                        return true;
                    }
                }
            }
        }

        visited[current] = false;

        return false;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 2, 3, 4};
        int[] B = {2, 3, 4, 5};

        boolean result = solution(N, A, B);

        System.out.println("1번 정점에서 N번 정점까지 경로가 있는지: " + result);
    }
}



/*
1부터 N까지 번호가 매겨진 N개의 정점과 M개의 간선으로 구성된 무방향 그래프가 주어진다.
이 그래프는 길이가 M인 두 개의 배열 A와 B로 나타낼 수 있다. K가 0에서 M-1까지일 때 K에 대한 상 (A[K], B[K])은 정점 A[K]와 정점 B[K] 사이의 간선을 나타낸다.
주어진 그래프에 정점 1부터 정점 N까지 모든 정점을 하나씩 오름차순으로 통과하는 경ㅇ로가 있는지 확인하시오. 경로 위의 모든 길은 직접 연결되어야 한다.
 */