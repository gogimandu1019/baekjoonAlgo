package Main;
import java.io.*;
public class baekjoon1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); //입력받은수
        int line = 0; //라인수
        int cnt = 0; //해당라인 마지막수 구할 변수
        int top = 0; //분자
        int bottom = 0; //분모

        while (cnt < x){
            line ++; //라인수 +1
            cnt = line * (line+1) / 2; //1~n라인까지의 합으로 해당라인 최종 수
        }
        if(line % 2 != 0){ //홀수 라인
            // 분자 + 분모 = 1 + line
            top = 1 + cnt - x; //분자 = 1 + line*(line+1)/2 - x;
            bottom = line + x - cnt; //분모 = 1 + line - 분자
        } else { //짝수 라인
            // 홀수라인 케이스와 반대
            bottom = 1 + cnt - x;
            top = line + x - cnt;
        }
        System.out.println(top + "/" + bottom);
    }
}

