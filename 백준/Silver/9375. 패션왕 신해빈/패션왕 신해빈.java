import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	
    	for(int t=0; t<tc; t++) {
    		int n = Integer.parseInt(br.readLine());
    		Map<String, Integer> map = new HashMap<>();
    		
    		for(int i=0; i<n; i++) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			String value = st.nextToken();
    			String key = st.nextToken();
    			
    			if(map.containsKey(key)) {
    				map.put(key, map.get(key)+1);
    			}
    			else {
    				map.put(key, 1);
    			}
    		}
    		
    		int answer = 1;
			
			for(String k:map.keySet()) {
				answer *= map.get(k) +1;
			}
    		
			System.out.println(answer -1);
    	}
    }
}