import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int cnt = 0;
        
        for(int j = 0; j < arr.length; j++){

            if(cnt == 0){
                stk = Arrays.copyOf(stk, stk.length + 1); //   배열 추가하는것
                stk[cnt] = arr[j];
                cnt++;

            }
            else{
                if(stk[cnt-1] >= arr[j]){            
                    stk = Arrays.copyOf(stk, stk.length - 1); //   배열 제거하는것
                    cnt--;
                    j--;

                }
                else {
                    stk = Arrays.copyOf(stk, stk.length + 1); //   배열 추가하는것
                    stk[cnt] = arr[j];  
                    cnt++;
                }
            }
        }

        return stk;
    }
}