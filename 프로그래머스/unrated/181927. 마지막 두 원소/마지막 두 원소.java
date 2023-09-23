import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int n = num_list.length;
        
        num_list = Arrays.copyOf(num_list, n + 1);
        
        if(num_list[n-1]  <= num_list[n-2]  ){
            num_list[n] = num_list[n-1] * 2;
        }
        else{
            num_list[n] = num_list[n-1] - num_list[n-2];
        }
        
        answer = num_list;
        
        return answer;
    }
}