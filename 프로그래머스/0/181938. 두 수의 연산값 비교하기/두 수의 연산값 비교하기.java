class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.valueOf(""+a+b);
        int c = 2 * a * b;
        
        if(ab == c) {
            return ab;
        }else {
            return answer = Math.max(ab,c);
        }
    }
}