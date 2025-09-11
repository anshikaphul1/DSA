import java.util.*;
class Solution {
     // sabse pehle vowels ko lower case mei convert kro 
        public boolean isVowel(char c){
            c=Character.toLowerCase(c);
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }
    public String sortVowels(String s) {
        // ab vowels ko extract kro
        List<Character>vowels=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        // vowels ko sort kro ussi string ke andar
        Collections.sort(vowels);
        char[]result=s.toCharArray();
        int vowelindex=0;
        for(int i=0;i<result.length;i++){
            if(isVowel(result[i])){
                result[i]=vowels.get(vowelindex);
                vowelindex++;
            }
        }
        return new String(result);
    }
}