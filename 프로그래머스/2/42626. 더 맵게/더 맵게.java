import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cnt = 0;
        
        for(int i=0; i<scoville.length; i++){
            heap.add(scoville[i]);
        }
        
        while(heap.size() >= 2) {
            if(heap.peek() >= K){
                return cnt;
            }
            int min1 = heap.poll();
            int min2 = heap.poll();
            int mix = min1 + min2 * 2;
            heap.add(mix);
            cnt += 1;
            if(heap.peek() >= K){
                return cnt;
            }
        }
        
        return -1;
     
    }
}