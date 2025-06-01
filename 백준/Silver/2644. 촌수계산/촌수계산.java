import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        int[][] graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        System.out.println(bfs(a, b, graph));
    }

    static int bfs(int a, int b, int[][] graph) {
        Queue<int[]> q = new LinkedList<>();

        boolean[] visited = new boolean[n + 1];

        visited[a] = true;
        q.add(new int[] { a, 0 });

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int now = temp[0];
            int dist = temp[1];

            if (now == b) {
                return dist;
            }

            for (int i = 1; i <= n; i++) {

                if (graph[now][i] == 1) {
                    if (!visited[i]) {
                        visited[i] = true;
                        q.add(new int[] { i, dist + 1 });
                    }
                }

            }
        }

        return -1;
    }

}
