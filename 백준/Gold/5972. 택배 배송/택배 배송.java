import java.io.*;
import java.util.*;

public class Main {
    static int N; // 헛간 개수
    static int M; // 소들의 길 개수 (양방향)
    static ArrayList<int[]>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<int[]>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 양방향 연결
            graph[a].add(new int[] { b, c });
            graph[b].add(new int[] { a, c });
        }

        System.out.println(dijkstra(1, N));

    }

    static int dijkstra(int start, int goal) {
        boolean[] visited = new boolean[N + 1];
        var queue = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        queue.add(new int[] { start, 0 });

        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int node = u[0];
            int cost = u[1];

            if (visited[node])
                continue;
            if (node == goal)
                return cost;

            visited[node] = true;

            for (int[] edge : graph[node]) {
                int next = edge[0];
                int nextCost = edge[1];
                queue.add(new int[] { next, cost + nextCost });
            }
        }

        return 0;
    }

}