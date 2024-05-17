import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            for(int i=0; i<10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int sum = 0;
            for(int i=1; i<9; i++) {
                sum += arr[i];
            }
            float tmp = (float)sum/8;
            int ans = Math.round(tmp); //반올림
            System.out.println("#"+tc+" "+ans);
        }
    }
}