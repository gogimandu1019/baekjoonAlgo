package Main;
import java.io.*;
import java.util.*;
public class baekjoon1978 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < tc ; i++){

            int x = sc.nextInt();

            boolean prime = true;

            if (x == 1){    //1은 소수가 아님
                continue;
            }

            for(int j = 2; j <= Math.sqrt(x); j++){
                if(x % j == 0){    //소수가 아닌 경우
                    prime = false;
                    break;
                }
            }

            if(prime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
