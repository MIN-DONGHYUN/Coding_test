class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        
        if(n % 2 == 0){
            for(int i = 0; i < (n / 2) - 1; i++) {
                a += 2;
                answer += a*a;
            }
            answer += n*n;
        }
        else{   
            a = -1;
            for(int i = 0; i < (n / 2); i++) {
                a += 2;
                answer += a;
            }
            answer += n;
        }
        
        return answer;
    }
}