import java.io.*;

public class baekjoon1712{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());    //고정비용
        int b = Integer.parseInt(br.readLine());    //가변비용
        int c = Integer.parseInt(br.readLine());    //대당 판매가격

        int x = 0;

        if(b != c){
            try{
                x = a / (c-b) + 1;
            } catch(Exception e) {
                x = -1;
            }
        }

        if(x <= 0) {    //손익분기점이 안나오는 경우
            x = -1;
        }

        System.out.println(x);

    }
}