import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int v = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i:arr){
            if(i == v){
                sum += 1;
            }
        }

        System.out.println(sum);


    }
}
