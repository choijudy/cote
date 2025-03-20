import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int[] arr:commands){
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            
            int[] a = Arrays.copyOfRange(array, i-1, j);
            for(int t=0; t<a.length; t++){
                System.out.print(a[t]);
            }
            System.out.println("");
            
            Arrays.sort(a);
            answer[index] = a[k-1];
            index++;
        }
        
        return answer;
    }
}