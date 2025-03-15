import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<t; i++){
            arr.add(br.readLine());
        }

        for(int i=0; i<t; i++){
            char s1 = arr.get(i).charAt(0);
            char s2 = arr.get(i).charAt(arr.get(i).length()-1);
            StringBuilder result = new StringBuilder();
            result.append(s1);
            result.append(s2);
            System.out.println(result);
        }
    }
}
