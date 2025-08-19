// import java.util.*;
// class Solution {
//     public int romanToInt(String s) {
//         HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
//         hash.put('I',1);
//         hash.put('V',5);
//         hash.put('X',10);
//         hash.put('L',50);
//         hash.put('C',100);
//         hash.put('D',500);
//         hash.put('M',1000);
//         int result=hash.get(s.charAt(s.length()-1));
//         for(int i=s.length()-2;i>=0;i--){
//             if(hash.get(s.charAt(i))<hash.get(s.charAt(i+1))){
//                 result=result-hash.get(s.charAt(i));
//             }
//             else{
//                 result=result+hash.get(s.charAt(i));
//             }
//         }
//         return result;
//     }
// }






class Solution {
    public int romanToInt(String str) {
      int sum = 0;
        int current = translate(str.charAt(0));

        for(int i=1;i<str.length();i++){
            int next = translate(str.charAt(i));

            if(current<next){
                sum -= current;
            }else{
                sum += current;
            }
            current = next;
        }

        sum += current;
        return sum;   
    }
    public static int translate(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}