class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int query[] : queries){  // 향상된 for문 (변수 : 배열) 
            int A = query[0];
            int B = query[1];
            int result = arr[A];
            arr[A] = arr[B];
            arr[B] = result;
        } 
        answer = arr;
        
        return answer;
    }
}