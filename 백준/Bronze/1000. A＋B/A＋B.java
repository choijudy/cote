import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        int a,b;
        
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            if(a>0 && b<10){
                break;
            }
        }
        System.out.println(a + b);
    }
}