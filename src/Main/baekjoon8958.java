package Main;
import java.util.*;
import java.io.*;
public class baekjoon8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());    //테스트케이스 수
        String[] arr = new String[testcase];
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < testcase ; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < testcase ; i++){
            cnt = 0;
            sum = 0;
            for(int j = 0; j< arr[i].length() ; j++){
                if(arr[i].charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum = sum + cnt;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);

    }
}
