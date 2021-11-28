package Main;
import java.io.*;
public class baekjoon2292 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int n = 0;

        if (num == 1){//들어온 방번호가 1이면 1층을 뱉어준다 : 예외처리
            n = 1;
        } else { //각층 마지막 방번호 < 입력받은 방번호 라면 반복
            while((3*n*n - 3*n + 1) < num) {
                n++;
            }
        }

        System.out.print(n);
    }
}
