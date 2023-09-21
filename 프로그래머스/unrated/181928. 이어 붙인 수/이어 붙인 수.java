class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String A = "";
        String B = "";
        int ONE = 0;
        int TWO = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            
            if(num_list[i] % 2 == 0){
                A += Integer.toString(num_list[i]);
            }
            else{
                B += Integer.toString(num_list[i]);
            }
        }
        ONE = Integer.parseInt(B);
        TWO = Integer.parseInt(A);
        answer = ONE + TWO;
        
        
        return answer;
    }
}