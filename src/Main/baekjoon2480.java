package Main;
import java.io.*;
import java.util.*;
public class baekjoon2480 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int prize = 0;
        int max = 0;

        //a = b = c
        if(a == b && a == c){
            prize = 10000 + a * 1000;
        } else{
            if(a == b || a == c){    //a = b or a = c
                prize = 1000 + a * 100;
            } else if(b == c){    //b = c
                prize = 1000 + b * 100;
            } else {    //모두 같지 않은 경우
                max = Math.max(a, Math.max(b, c));    //3개 최댓값
                prize = max * 100;
            }
        }

        System.out.println(prize);

    }
}
