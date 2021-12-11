package Main;
import java.io.*;
public class baekjoon2775 {

    public static int [][] apt = new int [15][15];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    //테스트케이스 갯수

        makeApt();

        for (int i = 0 ; i < T ; i++){
            int k = Integer.parseInt(br.readLine());    //k층
            int n = Integer.parseInt(br.readLine());    //n호

            System.out.println(apt[k][n]);    //k층 n호의 거주자수 : makeApt()에서 구해온값 소환
        }


    }
    //아파트 생성
    public static void makeApt(){
        for (int i = 0 ; i < 15 ; i++){
            apt[i][1] = 1;    //각층 1호는 1명
            apt[0][i] = i;    //0층 i호는 i명
        }

        for (int i = 1; i < 15; i++){    //1~14층
            for (int j = 2; j < 15; j++){    //2~14호 : 아까 0층이랑, 1호라인 먼저셋팅함
                apt[i][j] = apt[i-1][j] + apt[i][j-1];    //a-1층 b호 + a층 b-1호의 합
            }
        }
    }
}

