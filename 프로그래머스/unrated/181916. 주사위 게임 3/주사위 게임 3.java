class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;      // 답변 
        int count = 0;       // 몇개가 같은지
        int min = 7;         // 하나도 안맞을시 최소값을 나타내기 위해
        int same = 0;        // 값이 같은것을 나타내기 위해 
        int p = 0;           // 문제의 p , q , r 을 구분하기 위해 
        int q = 0;
        int r = 0;
        int arr[] = {a, b, c, d};    // 배열에 넣고 같은것을 찾아내기 위해 
        
        for(int i = 0; i < arr.length; i++){       // 같은 것을 구분하기 위해 
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){      // 같은 것이면 count 더하고 same에 값 저장 
                    count++;
                    same = arr[j];
                } 
            }
        }
        switch(count){     //count 개수에 따라 설정 
            case 0:
            {
                 for(int z = 0; z < arr.length; z++){
                     if(arr[z] <= min){
                         min = arr[z];
                     }
                 }  
                answer = min;
                break;
            }
            case 1:
            {
                int cnt = 0;
                for(int z = 0; z < arr.length; z++){   
                     if(arr[z] != same && cnt == 0){                       
                         q = arr[z];
                         cnt++;
                     }
                     else if(arr[z] != same && cnt == 1){
                         r = arr[z];
                     }
                 } 
                 answer = q * r;
                 break;
                 
            }
            case 2:
            {
                for(int z = 0; z < arr.length; z++){                     
                     if(arr[z] == same){                       
                         p = arr[z];
                     }
                     else {
                         q = arr[z];
                     }
                 } 
                
                answer =  (p + q) * Math.abs(p - q);
                break;
            }
            case 3:
            {
                 for(int z = 0; z < arr.length; z++){                     
                     if(arr[z] != same){                       
                         q = arr[z];
                     }
                 }
                 answer = (10 * same + q) * (10 * same + q);
                 break;
            }
            default :
            {
                answer = same * 1111;
            }
        }

        return answer;
    }
}