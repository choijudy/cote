import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int s;
    static int[] arr;
    static int ans = 0;

    public static void dfs(int start, int sum){
        if(start == n){
            if(sum == s) ans++;
            return;
        }

        dfs(start+1,sum+arr[start]);

        dfs(start+1, sum);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,  0);

        if(s==0){
            --ans;
        }

        System.out.println(ans);
    }
}