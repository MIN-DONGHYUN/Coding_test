class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0 , s) + overwrite_string;   // substring 은 문자열을 index로 나눌때 사용한다. 
        
        if(my_string.length() - answer.length() != 0) {
            answer += my_string.substring(answer.length(), my_string.length());
        }
        
        System.out.println(answer);

        return answer;
    }
}