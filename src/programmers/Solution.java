package programmers;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int max = 0;
        int count = 0;
        int index = 0;

        //최댓값 구하기
        for(int a : arr){
            if (a > max){
                max = a;
            }
        }
        //최댓값 개수
        for(int a : arr){
            if(a == max){
                count++;
            }
        }

        //정답 배열에 인덱스 채우기
        answer = new int[count];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}