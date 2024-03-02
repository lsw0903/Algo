import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 실행횟수
        int tc = Integer.parseInt(br.readLine());
        // 테스트 실행횟수 숫자 올려주는?
        for(int t = 1; t <= tc; t++){
            //입력된 두 수
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n1 = 0;
            int n2 = 0;
            // 입력된 토큰 나누기
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            //수 비교 연산자 비교하기
            //연산자를 저장할 변수 선언
            char op = ' ';
            //두 수가 같다면 = 저장
            if(n1 == n2){
                op = '=';
            }
            else if(n1 > n2){
                op = '>';
            }
            else {
                op = '<';
            }
            //결과를 표시한다
            System.out.printf("#%d %c%n", t, op);
        }
    }
}

