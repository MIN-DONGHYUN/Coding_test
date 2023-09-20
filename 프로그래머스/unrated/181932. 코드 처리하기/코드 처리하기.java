class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char A;
        
        for(int idx = 0; idx < code.length(); idx++){
            
            A = code.charAt(idx);            
            
            if(mode == 0){
                if(A != '1' && idx % 2 == 0){
                    answer += A;
                }
                else if(A == '1'){
                    mode = 1;
                }
            }
            else {
                if(A != '1' && idx % 2 == 1){
                    answer += A;                
                }
                else if(A == '1'){
                    mode = 0;
                }
            }
        }
        
        if(answer.equals("")){
            answer = "EMPTY";
        }
        
        return answer;
    }
}