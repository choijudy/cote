import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        ArrayList<Integer> sum = new ArrayList<>();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a == 0 && b ==0){
                break;
            }

            sum.add(a+b);
        }

        for(int i:sum){
            System.out.println(i);
        }
    }
}
