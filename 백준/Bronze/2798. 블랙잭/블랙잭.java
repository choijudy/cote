import java.util.*;
import java.io.*;

 class Main {
     static int n;
     static int m;
     static int[] arr;
     static int max = 0;

     public static void dfs(int s, int cnt, int sum){
         // 종료조건 1
         if(sum > m){
             return;
         }
         // 종료조건 2
         else if(cnt == 3){
             max = Math.max(max, sum);
             return;
         }

         for(int i=s; i<n; i++){
             dfs(i+1, cnt+1, sum + arr[i]);
         }

     }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);

        System.out.println(max);
    }
}