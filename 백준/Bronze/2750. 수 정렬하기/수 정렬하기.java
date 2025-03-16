import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	for(int i=0; i<n; i++) {
    		arr.add(Integer.parseInt(br.readLine()));
    	}
    	
    	Collections.sort(arr);
    	
    	for(int i=0; i<n; i++) {
    		System.out.println(arr.get(i));
    	}
    	
    }
}