import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        
        answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
        answer[cnt++] = n;
        
        while(n != 1){
            
            answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것                                   
            if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = 3 * n + 1;
            }
            answer[cnt++] = n;
            
        }
        
        return answer;
    }
}