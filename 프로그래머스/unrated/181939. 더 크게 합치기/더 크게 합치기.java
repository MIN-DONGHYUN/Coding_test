class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = 0;
        
        // Integer.parseInt(Integer.toString(a) + Integer.toString(b)); 는 () 안에 있는 숫자형을 문자형으로 변환한 다음 다시 숫자(int)형으로 바꾸는 것을 말한다. 
        
        answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));   
        num = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(answer < num) {
            answer = num;
        }
        
        
        return answer;
    }
}