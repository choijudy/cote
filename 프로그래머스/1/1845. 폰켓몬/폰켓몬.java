import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int result = (nums.length / 2);
        
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        int answer = 0;
        
        if(set.size() >= result){
            answer = result;
        }
        else{
            answer = set.size();
        }
        
        return answer;
    }
}