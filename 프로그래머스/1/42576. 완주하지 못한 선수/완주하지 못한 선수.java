import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String player:participant){
            // 이미 목록에 있으면
            if(map.containsKey(player)){
                map.put(player, map.get(player) + 1);
            }
            else{
                map.put(player, 1);
            }
        }
        
        for(String player:completion){
            map.put(player, map.get(player) - 1);
        }
        
        String answer = "";
        
        for(String player:participant){
            if(map.get(player) != 0){
                answer = player;
                break;
            }
        }
            
        return answer;
    }
}