import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) throws Exception {
        
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == s1[i%5]) cnt[0]++;
            if(answers[i] == s2[i%8]) cnt[1]++;
            if(answers[i] == s3[i%10]) cnt[2]++;
        }
         
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        System.out.println(max);
        
        List<Integer> list = new ArrayList<>();
        
        if(max == cnt[0])
            list.add(1);
        if(max == cnt[1])
            list.add(2);
        if(max == cnt[2])
            list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
       
        return answer;
    }
}