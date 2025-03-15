import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long n = Long.parseLong(st.nextToken());
        Long m = Long.parseLong(st.nextToken());

        Long r = n - m;
        
        if(r < 0){
            System.out.println(-r);
        }
        else{
            System.out.println(r);
        }
    }
}
