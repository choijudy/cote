import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int arr_sum = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr_sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        int left = max;
        int right = arr_sum;
        int answer = arr_sum;

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += arr[i];
            }

            if (sum != 0) {
                cnt++;
            }

            if (cnt > m) {
                left = mid + 1;
            } else if (cnt <= m) {
                answer = Math.min(answer, mid);
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }

}
