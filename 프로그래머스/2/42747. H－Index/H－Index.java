import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int  n = citations[citations.length-1];
        
        for(int i=0; i<n; i++){
            int h = i; //0부터 6까지?
            int sum = 0;
            for(int j=0; j<citations.length; j++){
                if(citations[j] >= h){
                    sum++;
                }
            }
            if(sum >= h){
                answer = h;
            }
        }
        return answer;
    
    }
}