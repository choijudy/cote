import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int gcd = gcd(a, b);
    	System.out.println(gcd);
    	System.out.println(a * b / gcd);
    	
    }
    
    public static int gcd(int a, int b) {
    	if(b == 0) {
    		return a;
    	}
    	else return gcd(b, a%b);
    }
}