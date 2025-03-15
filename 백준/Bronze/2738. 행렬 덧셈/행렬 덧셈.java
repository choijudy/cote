import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 행렬 크기 입력 받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];

        // 첫 번째 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 번째 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 덧셈 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(matrixA[i][j] + matrixB[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb); // 결과 한 번에 출력
    }
}
