import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());
        Long d = Long.parseLong(st.nextToken());
        Long e = Long.parseLong(st.nextToken());

        System.out.println(func(a,b,c,d,e));
    }

    public static Long func(Long a, Long b, Long c, Long d, Long e){
        long aa = a*a;
        long bb = b*b;
        long cc = c*c;
        long dd = d*d;
        long ee = e*e;
        long sum = aa + bb + cc + dd + ee;
        return sum % 10;
    }
}
