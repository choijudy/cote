import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean [] check = new boolean[31];

        for(int i=1; i<=28; i++){
            int j = Integer.parseInt(br.readLine());
            check[j] = true;
        }

        for(int i=1; i<=30; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }
}
