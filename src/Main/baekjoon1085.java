package Main;
import java.io.*;
import java.util.*;

public class baekjoon1085{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int width_min = Math.min(x, w-x);
        int height_min = Math.min(y, h-y);

        int total_min = Math.min(width_min, height_min);

        System.out.println(total_min);

    }
}