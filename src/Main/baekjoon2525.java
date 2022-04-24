package Main;
import java.io.*;
import java.util.*;
public class baekjoon2525 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int h = 0;
        int m = 0;

        h = A + ((B+C)/60);
        if(h >= 24){
            h = h - 24;
            if(h < 0){
                System.err.println("시가 음수일 수 없음");
            }
        }

        m = (B+C) % 60;

        System.out.println(h + " " + m);


    }
}
