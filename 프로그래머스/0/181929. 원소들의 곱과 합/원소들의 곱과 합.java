class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        
        for(int i=0; i<num_list.length; i++) {
            a *= num_list[i];
            b += num_list[i];
        }
        
        if(Math.pow(b,2) > a) {
            answer = 1;
        }else if(Math.pow(b,2) < a) {
            answer = 0;
        }
        
        return answer;
    }
}