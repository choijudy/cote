import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 사람의 수 n
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 촌수 계산 할 두 사람 a,b
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 관계의 개수 (노드 간선 수) m
        m = Integer.parseInt(br.readLine());

        // 부모 자식간의 관계 배열
        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        // 입력 받아서 저장할 배열
        int[][] edges = new int[m][2];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
        }

        // 입력받은 배열을 arr에 노드처럼 저장하기
        for (int[] e : edges) {
            int e1 = e[0]; // 부모 노드
            int e2 = e[1]; // 자식 노드

            // 양방향 링크로 수정
            arr[e1].add(e2);
            arr[e2].add(e1);
        }

        System.out.println(bfs(a, b));

    }

    static int bfs(int a, int b) {
        // 해당 노드를 방문했는지 검사
        // index를 노드 번호로 사용 (n + 1 크기)
        boolean[] visited = new boolean[n + 1];

        // 방문할 다음 노드를 저장할 queue 생성
        ArrayDeque<int[]> q = new ArrayDeque<>();

        // 큐에 시작 노드 넣어줌, 거리는 0으로 설정
        q.add(new int[] { a, 0 });

        while (!q.isEmpty()) {
            // 현재 큐에 있는 값을 가져와서
            // 현재 node와 거리를 저장해둠
            int[] u = q.poll();
            int node = u[0];
            int dist = u[1];

            // 현재 노드에 방문한 적 있는지 검사
            if (visited[node])
                continue;

            // 현재 노드를 true로 바꿔줌
            visited[node] = true;

            // 현재 노드가 b 노드가 되면 거리 반환
            if (node == b) {
                return dist;
            }

            // 해당 노드에서 방문할 다음 큐를 찾아서 넣음
            for (int e : arr[node]) {
                q.add(new int[] { e, dist + 1 });
            }

        }

        return -1;
    }

}
