import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문제해석
 * 10개의 수를 입력 받아 홀수만 더한값 출력
 * 가장 첫 줄에 테스트 케이스의 개수 T, 그 아래로 각 테스트 케이스
 * 각 테스트 케이스 첫줄엔 10개의 수
 * 출력의 각 줄은 #t로 시작, 공백을 한 칸 둔 다음 정답 출력
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t = 1; t <= tc; t++){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i<10; i++){
                int num = Integer.parseInt(st.nextToken());
                //홀수 판별하기
                if(num % 2 == 1) sum += num;
            }
            //출력
            System.out.printf("#%d %d%n", t, sum);
        }
    }
}