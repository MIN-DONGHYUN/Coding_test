class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        // reverse
        StringBuffer sb = new StringBuffer(my_string.substring(s , e + 1));
        String reversedStr = sb.reverse().toString();
        
        
        answer = my_string.substring(0 , s) + reversedStr + my_string.substring(e + 1 , my_string.length());
        
        return answer;
    }
}