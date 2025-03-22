import java.io.*;
import java.util.*;

public class Main {
	
	static int n,m;
	static StringBuilder sb;
	
	static void func(int cnt, int[] arr) {
		if(cnt == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			arr[cnt] = i;
			func(cnt+1, arr);
		}
	}

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[m];
        
        func(0, arr);
        
        System.out.print(sb.toString());
    }
}