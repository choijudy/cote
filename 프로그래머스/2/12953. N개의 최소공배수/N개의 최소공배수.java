class Solution {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public static int lcm_arr(int[] arr) {
        int result = arr[0];
        for(int i=1; i<arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }
    
    
    public int solution(int[] arr) {
        int answer = lcm_arr(arr);
        return answer;
    }
}