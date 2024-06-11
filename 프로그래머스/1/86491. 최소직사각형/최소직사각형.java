import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] sizes) throws Exception {
        int answer = 0;
        
        /* 
        입력값 배열중 가장 큰 숫자를 고른다.
        입력값 배열중 작은 값의 숫자를 비교해서 최대값을 구한다.
        그 선택된 두 값을 곱한 값을 출력값으로 리턴한다.
        */
        
        int r = sizes.length;
        int c = sizes[0].length;
        
        int w = 0; //최댓값중의 최댓값
        int h = 0; //최솟값중의 최댓값
        
        for(int i = 0; i < r; i++) {          
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            w = Math.max(w, max);
            h = Math.max(h, min);
        }
        
        return w*h;
    }
}