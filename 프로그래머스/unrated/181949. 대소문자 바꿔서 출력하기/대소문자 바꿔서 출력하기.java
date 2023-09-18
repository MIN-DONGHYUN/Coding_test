import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        char b;
        
        for(int i = 0; i < str.length(); i++)
        {
            b = str.charAt(i);
            
            if(Character.isUpperCase(b)){     // isUpperCase 는 대문자를 검색
                answer += Character.toLowerCase(b);  // toLowerCase() 는 소문자로 변경하는것 
            }
            else if(Character.isLowerCase(b))
            {
                answer += Character.toUpperCase(b);
            } 
        }
        System.out.print(answer);
    }
}