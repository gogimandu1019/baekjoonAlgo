package programmers;
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int max = 0;
        int count = 0;
        List<Integer> list = new LinkedList<>();


        max = Arrays.stream(arr).max().getAsInt();    //optionalInt


        int finalMax = max;
        return  IntStream.range(0, arr.length).filter(i ->arr[i] == finalMax).toArray();
    }
}