import java.io.*;
import java.util.*;

public class Main {
	
	static int n,m;
	
	static void func(int start , int cnt, int[] arr) {
		//종료조건
		if(cnt == m) {
			for(int i=0; i<m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<=n; i++) {
			arr[cnt] = i;
			func(i+1,cnt+1,arr);
		}
	}

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[m];
        
        func(1,0,arr);
    }
}