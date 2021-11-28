import java.io.*;
import java.util.*;
public class baekjoon2869 {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());    //낮에 올라가는
        int b = Integer.parseInt(st.nextToken());    //밤에 미끄러지는
        int v = Integer.parseInt(st.nextToken());    //총 높이

        int day = 0;

        day = (v-b) / (a-b);

        //0으로 나누어떨어지지 않는 경우 - 미끄러지고 남은 높이가 낮에 올라가는 높이보다 적을때
        if((v-b) % (a-b) != 0){
            day ++;
        }

        System.out.println(day);
    }

}
