package Main;
import java.io.*;
import java.util.*;
public class baekjoon10250 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());    //테스트케이스 갯수
        for (int i = 0; i < tc ; i++){    //테스트케이스만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());    // 총 층수
            int w = Integer.parseInt(st.nextToken());    // 한 층에 방 갯수 - 사실 별 필요x
            int customer = Integer.parseInt(st.nextToken());    //n번째로 온 고객
            int room = 0;    //방 번호
            if(customer % h != 0){
                room = (customer % h) * 100 + ((customer / h) + 1);
            } else {
                room = h * 100 + (customer / h);
            }
            System.out.println(room);
        }

    }
}
