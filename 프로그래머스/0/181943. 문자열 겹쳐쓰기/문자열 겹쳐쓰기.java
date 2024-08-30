class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        int a = my_string.length();
        int b = overwrite_string.length();
        String answer = "";
        
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+b,a);
        
        return answer;
    }
}