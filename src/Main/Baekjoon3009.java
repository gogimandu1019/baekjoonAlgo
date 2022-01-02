package Main;
import java.io.*;
import java.util.*;
public class Baekjoon3009 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] p1 = {sc.nextInt(), sc.nextInt()}; //점1
        int[] p2 = {sc.nextInt(), sc.nextInt()}; //점2
        int[] p3 = {sc.nextInt(), sc.nextInt()}; //점3

        sc.close();

        int x = 0;    //구하는 x
        int y = 0;    //구하는 y

        //x좌표 3개 비교해서 서로 다른 값 하나 발라내기
        if(p1[0] == p2[0]){
            x = p3[0];
        } else if(p1[0] == p3[0]){
            x = p2[0];
        } else if(p2[0] == p3[0]){
            x = p1[0];
        } else {
            System.err.println("조건에 맞는 x좌표 구할 수 없음");
        }

        //y좌표 3개 비교해서 서로 다른 값 하나 발라내기
        if(p1[1] == p2[1]){
            y = p3[1];
        } else if(p1[1] == p3[1]){
            y = p2[1];
        } else if(p2[1] == p3[1]){
            y = p1[1];
        } else {
            System.err.println("조건에 맞는 y좌표 구할 수 없음");
        }

        System.out.println(x + " " + y);
    }
}
