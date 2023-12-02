class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++){
            String current_strings = my_strings[i];
            answer += current_strings.substring(parts[i][0],parts[i][1]+1);
            // substring은 문자열 추출 방법 마지막 +1의 이유는 그 index까지 추출해야 하기 때문
        }
        
        return answer;
    }
}