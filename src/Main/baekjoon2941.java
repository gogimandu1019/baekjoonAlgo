package Main;
import java.io.*;
public class baekjoon2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();    //입력받을 문자열
        br.close();

        int length = str.length();    //문자열의 글자수
        int cnt = str.length();    //출력할 글자수

        for (int i = 0; i < length; i++){    //문자열의 글자수
            //c=, c-
            if(str.charAt(i) == 'c' && i < length - 1){    //맨 마지막 하나 앞에 있는 c
                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){    //다음에 == , -가 오면
                    cnt--;    //c= , c- 두 글자가 한글자로 취급되므로 -1
                }
            }

            //dz=
            if(str.charAt(i) == 'd' && i < length - 2){
                if(str.charAt(i+1) == 'z' && i < length - 1){
                    if(str.charAt(i+2) == '='){
                        cnt = cnt -2;    //dz= 3글자가 1글자로 취급되므로 -2
                    }
                }
            }

            //d-
            if(str.charAt(i) == 'd' && i < length - 1){
                if(str.charAt(i+1) == '-'){
                    cnt--;
                }
            }

            //lj, nj
            if((str.charAt(i) == 'l' || str.charAt(i) =='n') && i < length - 1){
                if(str.charAt(i+1) == 'j'){
                    cnt--;
                }
            }

            //s=, z=
            if((str.charAt(i) == 's' || str.charAt(i) =='z') && i < length - 1){
                if(str.charAt(i+1) == '='){
                    cnt--;
                }
            }
        }

        System.out.println(cnt);
    }
}
