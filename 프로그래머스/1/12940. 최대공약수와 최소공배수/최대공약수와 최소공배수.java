class Solution {
    static public int gcd(int n, int m) {
        while(m != 0) {
            int t = n % m;
            n = m;
            m = t;
        }
        return n;
    }
    
    static public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
}