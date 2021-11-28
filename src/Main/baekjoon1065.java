package Main;
import java.io.*;
public class baekjoon1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(chkFunction(i));
    }

    public static int chkFunction(int number){
        int cnt = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        if(number >= 1 && number <= 99){
            cnt = number;    //두자리수까지는 계산할 필요 없음 뺄셈 하나만 하면 되어 무조건임
        } else {    //세자리수 입력들어오는 경우
            cnt =99;    //99개를 일단 깔고

            if(number == 1000){
                number = 999;    //1000은 누가봐도 계산할 필요 없어보임 - 999까지니까 999로 계산가능
            }

            for(int i = 100; i <= number ; i++){    //100부터 입력받은 백의자리 숫자까지
                a = i / 100;    //백으로 나눈 몫이 백의자리
                b = (i / 10) % 10;    //십으로 나누어서 일의자리 떨고, 그걸 10으로 나눈 나머지가 십의자리
                c = i % 10;    //십으로 나누고 남은 일의자리

                if((a-b) == (b-c)){    //백-십 == 십-일인 수는 조건 충족
                    cnt++;
                }
            }
        }

        return cnt;

    }
}
