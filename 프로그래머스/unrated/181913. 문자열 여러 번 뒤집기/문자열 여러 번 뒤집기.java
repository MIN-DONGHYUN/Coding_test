class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;        
        int length = my_string.length();
    
        for(int query[] : queries){  // 향상된 for문 (변수 : 배열) 
            StringBuffer sb = new StringBuffer(); 
            int A = query[0];
            int B = query[1];
            
            for(int i = A; i <= B; i++){
                sb.append( answer.charAt(i));    // stringBuffer에 저장 
            }             
            String reversedStr = sb.reverse().toString();  // 문자열 반대로 저장 하기 
            
            answer = answer.substring(0 , A) + reversedStr + answer.substring(B + 1 , length);  // substring은 index 순서대로 문자열을 끊는다

        }
        
        return answer;
    }
}