class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int a = my_string.length() / m;
        
        for(int i = 0; i < a; i++){
           int put = c+(m*i) - 1;
           answer += my_string.charAt(put);
        }
        
        
        return answer;
    }
}