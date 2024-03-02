import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 1; i <= t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            char res = '=';
            if( a > b ) res = '>';
            else if( a < b ) res = '<';
            System.out.printf("#%d %c\n", i, res);
        }
    }
}