import java.util.*;

class Solution {
    public static String Convert(String s){
        if(s.equals("zero")){
            return "0";
        }
        else if(s.equals("one")){
            return "1";
        }
        else if(s.equals("two")){
            return "2";
        }
        else if(s.equals("three")){
            return "3";
        }
        else if(s.equals("four")){
            return "4";
        }
        else if(s.equals("five")){
            return "5";
        }
        else if(s.equals("six")){
            return "6";
        }
        else if(s.equals("seven")){
            return "7";
        }
        else if(s.equals("eight")){
            return "8";
        }
        else if(s.equals("nine")){
            return "9";
        }
        else{
            return "false";
        }
    }
    
    public int solution(String s) {
        int answer = 0;
        StringBuilder origin = new StringBuilder(); // 변환 할 문자를 저장할 변수
        StringBuilder converted = new StringBuilder(); // 변환 후의 문자를 저장할 변수
        
        for(char c:s.toCharArray()){
            if(!Character.isDigit(c)){
                origin.append(c);
                String str = Convert(origin.toString()); 
                if(!str.equals("false")){ // Convert함수 호출 후 반환값이 false가 아니면
                    converted.append(str);
                    origin.delete(0, origin.length());
                }
                else{
                    continue;
                }
            }
            else{
                converted.append(c);
            }
        }
        
        answer = Integer.parseInt(converted.toString());

        return answer;
    }
}