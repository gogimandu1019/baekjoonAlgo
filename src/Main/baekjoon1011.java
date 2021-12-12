package Main;
import java.io.*;
import java.util.*;
public class baekjoon1011 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int dist = 0;
        int move = 0;
        int max = 0;

        for(int i = 0; i < T ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dist = b - a;

            max = (int)Math.sqrt(dist);    //max = 거리의 제곱근의 정수부분

            if(max == Math.sqrt(dist)){
                move = 2*max - 1;
            } else if(dist <= max*max + max){
                move = 2*max;
            } else if(dist > max*max + max) {
                move = 2*max + 1;
            } else {    //그럴리 없겠지만 예외처리
                move = 0;
            }
            System.out.println(move);

        }
    }
}
