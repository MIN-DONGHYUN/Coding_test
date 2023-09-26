import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int cnt = 0;
        
        for(int i = start_num; i <= end_num; i++){
            answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
            answer[cnt++] = i;
        }
        
        return answer;
    }
}