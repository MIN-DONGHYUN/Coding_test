import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String str = "";
        
        for(int i = 0; i < intStrs.length; i++) {
            str = "";
            for(int j = s; j < s + l; j++){
                str += intStrs[i].charAt(j);            
            }
            if(Integer.parseInt(str) > k){
                answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
                answer[answer.length - 1] = Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}