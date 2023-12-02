class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        int minLength = Math.min(my_string.length(), is_prefix.length());
        // 각 문자열의 최소만 반복하기 위해 설정함 
        
        if(my_string.length() >= is_prefix.length()){
            for(int i = 0; i < minLength; i++){
                char a = my_string.charAt(i); 
                char b = is_prefix.charAt(i);

                if(a != b){
                    answer = 0;
                    break;
                }
            }
        }
        else{
            answer = 0;
        }

        return answer;
    }
}