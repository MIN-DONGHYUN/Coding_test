class Solution {
    public int solution(String number) {
        int answer = 0;        
        
        for(int i = 0; i < number.length(); i++){

            answer += number.charAt(i) - '0';     //  숫자 char 형을 int형으로 바꿈             
        }
        
        answer = answer % 9; 
        
        return answer;
    }
}