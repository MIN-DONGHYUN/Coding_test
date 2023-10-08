import java.util.Arrays;

class Solution {

    public int[] solution(String my_string) {

        int[] answer = {};

        for(int i = 0; i < 52; i++)

        {
            int ch = 0;
            int ch2 = 0;
            answer = Arrays.copyOf(answer, answer.length + 1); //   배열 추가하는것
            
            for(int j = 0; j < my_string.length(); j++)

            {
            
                if(my_string.charAt(j) == 'A' + i){

                    ch++;
                }
                else if(my_string.charAt(j) == 'a' + i - 26){
                    ch2++;
                }
             }

            if(i < 26 ){
                answer[i] = ch;
            }  
            else{
                answer[i] = ch2;
            }
            
        }

        

        return answer;

    }

}
    