class Solution {
    public static int gcd(int w, int h) {
        while(h != 0) {
            int t = w % h;
            w = h;
            h = t;
        }
        return w;
    }
    
    public static int lcm(int w, int h) {
        return w * h / gcd(w, h);
    }
    
    public long solution(int w, int h) {
        long line = (long)w + (long)h - gcd(w, h);
        long answer = (long)w * (long)h - line;
        return answer;
    }
}