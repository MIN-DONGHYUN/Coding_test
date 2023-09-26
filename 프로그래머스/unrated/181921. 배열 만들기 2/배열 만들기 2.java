import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        String str = "";
        int cnt = 0;
        
        for(int i = l; i <= r; i++ ){
            str = Integer.toString(i);
            str = str.replaceAll("[^50]", "!");  // 정규표현식 5와 0이 아닌것은 ! 로 변경함
            
            if (!str.contains("!")) {
                answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
                answer[cnt] = i;
                cnt++;
            }            
        }
        if(cnt == 0){
            answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
            answer[cnt] = -1;
        }

        return answer;
    }
}