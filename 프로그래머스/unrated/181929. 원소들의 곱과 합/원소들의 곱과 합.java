class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mult = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mult *= num_list[i];
        }
        sum *= sum;
        
        System.out.println(sum);
        System.out.println(mult);
        
        if(mult < sum){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}