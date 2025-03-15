import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int j = Integer.parseInt(st2.nextToken());
            if(j < x){
                arr.add(j);
            }
        }

        for(int i:arr){
            System.out.print(i + " ");
        }


    }
}
