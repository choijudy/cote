import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static ArrayList<int[]>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new int[] { b, c });
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(start, end));

    }

    static int dijkstra(int start, int goal) {
        var visited = new boolean[N + 1];
        var queue = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);

        queue.add(new int[] { start, 0 });

        while (queue.size() > 0) {
            int[] u = queue.remove();
            int node = u[0];
            int cost = u[1];
            if (visited[node])
                continue;
            visited[node] = true;
            if (node == goal)
                return cost;
            for (int[] edge : graph[node]) {
                int next = edge[0];
                int nextCost = edge[1];
                queue.add(new int[] { next, nextCost + cost });
            }
        }

        return -1;
    }
}