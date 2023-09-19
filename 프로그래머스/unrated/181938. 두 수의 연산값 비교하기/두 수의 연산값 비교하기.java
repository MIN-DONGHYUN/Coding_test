class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int C = 0;
        
        answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        C = 2 * a * b;
        
        if(answer < C) {
            answer = C;
        }

        return answer;
    }
}