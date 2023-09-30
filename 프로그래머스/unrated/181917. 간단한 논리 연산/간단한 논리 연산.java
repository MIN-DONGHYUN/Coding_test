class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean test1 = true;
        boolean test2 = true;
    
    if(x1 != false || x2 != false){
        test1 = true;
    }
    else{
        test1 = false;
    }
    
    if(x3 != false || x4 != false ){
        test2 = true;
    }
    else{
        test2 = false;
    }
    
    if(test1 == true && test2 == true){
        answer = true;
    }
    else{
        answer = false;
    }

        return answer;
    }
}