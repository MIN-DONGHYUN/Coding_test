class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for(int i = 0; i < arr.length; i++) {  // 배열은 length() 에서 () 가 없어야 한다 
            answer += arr[i];
        }
        
        return answer;
    }
}