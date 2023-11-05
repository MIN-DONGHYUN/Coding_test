import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        Arrays.sort(indices); // 배열 정렬하기 
        
        int offset = 0;  // index 조정하기 위해 
        
        StringBuilder answerBuilder = new StringBuilder(my_string);  // StringBuilder 에 저장 
                
        for(int i = 0; i < indices.length; i++){   
            int A = indices[i] - offset;           // A 에 indices 배열 인덱스 넣기 + 뺀 만큼 index 빼기  
            answerBuilder.deleteCharAt(A);    // 인덱스 삭제 
            offset++;    // 삭제한 수 늘리기 
        }
        
        return answerBuilder.toString();   // 스트링빌더 String 으로 나타내기 
    }
}