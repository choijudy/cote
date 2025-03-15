import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while(true) {
            s = br.readLine();
            if (s == null || s.isEmpty()) break;
            System.out.println(s);
        }
    }
}
