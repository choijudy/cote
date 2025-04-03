import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {  
        int answer = 0;
        
        for(String s:skill_trees){
            String filtered = s.replaceAll("[^" + skill + "]", "");
            boolean b = true;
            
            for(int i=0; i<filtered.length(); i++){
                if(filtered.charAt(i) != skill.charAt(i)){
                    b = false;
                    break;
                }
                else{
                    b = true;
                }
            }
            
            if(b){
                answer += 1;
            }
            
        }
        
        return answer;
    }
}