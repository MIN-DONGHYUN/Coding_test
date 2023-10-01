class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int n = 0;
        
        for(int i = 0; i < index_list.length; i++){
            n = index_list[i];
            answer += my_string.charAt(n);
        }
        
        
        return answer;
    }
}