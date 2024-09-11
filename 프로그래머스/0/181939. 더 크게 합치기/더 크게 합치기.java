class Solution {
   public int solution(int a, int b) {
       
       int answer = 0;
	   
       String AB = String.valueOf(a) + String.valueOf(b);
       String BA = String.valueOf(b) + String.valueOf(a);
       
       int ab = Integer.parseInt(AB);
       int ba = Integer.parseInt(BA);
       
       answer = Math.max(ab,ba);
       
       return answer;
	}
}