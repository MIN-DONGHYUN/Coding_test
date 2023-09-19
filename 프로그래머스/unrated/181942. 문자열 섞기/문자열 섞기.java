class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char A;
        char B;
            
        for(int i = 0; i < str1.length(); i++) {   // 길이가 같다고 하니까 하나의 길이로 반복문 작성함 
            
            A = str1.charAt(i);   // 하나의 문자를 추출 
            B = str2.charAt(i);
                    
            answer = answer + A + B;    // answer에 저장 
        }
       
        return answer;
    }
}