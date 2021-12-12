package Main;
import java.io.*;
public class baekjoon2839 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = 0;

        if(a==4 || a==7){    //3, 5kg 봉지로 불가
            x = -1;
        } else if(a % 5 == 0) {    //5의 배수
            x = a / 5;    //몫 출력
        } else if(a % 5 == 1 || a % 5 == 3){    //5로 나눴을 때 나머지가 1이나 3
            x = a / 5 + 1;    //몫 +1
        } else if(a % 5 == 2 || a % 5 == 4){
            x = a / 5 + 2;    //몫 +2
        } else {
            x = -1;    //예외처리 -> 그럴리는 없겠으나..
        }

        System.out.println(x);
    }
}
