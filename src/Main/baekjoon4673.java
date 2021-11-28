package Main;

public class baekjoon4673 {
    public static void main(String[] args){
        boolean[] chk = new boolean[10000];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000 ; i++){
            int n = d(i);

            if(n <= 10000){
                chk[n] = true;
            }
        }

        for(int i = 1 ; i <= 10000; i++){
            if(!chk[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }

    public static int d(int number){    //함수
        int sum = number;
        while (number != 0){    //number가 0이 될때까지 반복
            sum = sum + (number/10); //10 나눈 몫을 더함
            number = number % 10;    //그다음 나머지
        }
        return sum;
    }
}
