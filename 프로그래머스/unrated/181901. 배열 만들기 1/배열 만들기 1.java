import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int a = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
               answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것 
                
               answer[a++] = i; 
            }
        }
        
        return answer;
    }
}