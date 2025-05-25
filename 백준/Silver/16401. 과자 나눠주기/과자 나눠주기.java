import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); // 조카의 수
        int n = Integer.parseInt(st.nextToken()); // 과자의 수

        int[] arr = new int[n]; // 과자의 길이를 저장할 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        int left = 1;
        int right = arr[n - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                cnt += arr[i] / mid;
                if (cnt >= m) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        System.out.println(answer);
    }

}
