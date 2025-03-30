import java.util.*;
import java.io.*;

 class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i <= n; i++) {
            int now = arr[i];

            while (!stack.isEmpty() && arr[stack.getFirst()]< now) {
                stack.pop();
            }

            if (stack.isEmpty())
                sb.append("0 ");
            else
                sb.append(stack.getFirst() + " ");

            stack.push(i);
        }

        System.out.println(sb.toString());

    }
}