class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];  // 배열 길이 설정
        int cnt = 0;
        
        for(int query[] : queries){  // 향상된 for문 (변수 : 배열) 
            
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = Integer.MAX_VALUE;
            
            for(int i = s; i <= e; i++ ){   
                
                if(arr[i] > k && arr[i] < min){
                    min = arr[i];
                    System.out.println(i);
                }
            }
            if(min == Integer.MAX_VALUE){
                min = -1;
            } 
            answer[cnt] = min;
            
            cnt++;
        }
        
        return answer;
    }
}

