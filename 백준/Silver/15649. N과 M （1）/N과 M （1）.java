import java.io.*;
import java.util.*;

public class Main {
	
	static int n,m;
	
	static void func(int cnt, int[] arr, boolean[] visited) {
		// 종료조건
		if(cnt == m) {
			for(int i=0; i<m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=1; i<=n; i++) {
			// visited를 사용했는지 검사
			if(visited[i]) continue; // 썼으면(True이면) 넘어가기
			
			arr[cnt] = i;
			visited[i] = true;
			func(cnt+1, arr, visited);
			visited[i] = false;
		}
		
	}

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[m];
        boolean[] visited = new boolean[9];
        
        func(0, arr, visited);

    }
}