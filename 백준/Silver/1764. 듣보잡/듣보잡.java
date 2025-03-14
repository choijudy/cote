import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for(int i=0; i<n; i++){
            set1.add(br.readLine());
        }

        for(int i=0; i<m; i++){
            set2.add(br.readLine());
        }

        Set<String> set3 = new TreeSet<>(set1);
        set3.retainAll(set2);
        System.out.println(set3.size());
        for(String p:set3){
            System.out.println(p);
        }
    }
}
