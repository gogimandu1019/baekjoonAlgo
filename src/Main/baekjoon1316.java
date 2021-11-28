package Main;
import java.io.*;
public class baekjoon1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    //단어갯수
        int answer = 0;

        for(int i = 0; i < n ; i++){    //단어 갯수만큼 반복
            String str = br.readLine();    //단어를 입력받음
            if(checker(str)){    //그룹단어 함수 입력해서 true이면
                answer++;    //갯수를 하나씩 까준다
            }
        }
        System.out.println(answer);
    }

    //체크 함수 : T/F판별만 하므로 boolean 타입
    public static boolean checker(String word) throws IOException{
        boolean check[] = new boolean[26];    //a부터 z까지 담을 배열 26자리
        for (int j = 1; j < word.length(); j++){    //마지막까지 보자
            if(word.charAt(j-1) != word.charAt(j) ){    //앞뒷글자가 다른 경우
                if(check[word.charAt(j)-'a'] == true){    //해당 번지가 이미 나온 경우
                    return false;    //false 찍고 끝
                } else{
                    //앞뒷글자가 다른데 지금까지 나오지 않은 새로운 글자가 나온 경우
                    check[word.charAt(j-1)-'a'] = true;    //true 로 변경
                }

            } else {
                continue;
            }
        }
        return true;
    }
}
