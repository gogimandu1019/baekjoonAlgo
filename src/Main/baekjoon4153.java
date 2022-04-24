package Main;
import java.io.*;
import java.util.*;
public class baekjoon4153 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            answer = "";

            if(a == 0 && b == 0 && c == 0){    //마지막줄 0 0 0으로 받기로 약속
                break;
            } else {
                if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                    answer = "right";
                } else {
                    answer = "wrong";
                }
                System.out.println(answer);
            }
        }
    }
}
