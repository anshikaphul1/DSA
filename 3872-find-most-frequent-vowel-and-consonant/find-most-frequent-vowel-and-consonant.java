class Solution {
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxFreqSum(String s) {
        int[] consonent=new int[26];
        int[] vowel=new int[26];
        int maxconsonent=0;
        int maxvowel=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowel[c-'a']++;
            }
            else{
                consonent[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            maxvowel=Math.max(maxvowel,vowel[i]);
            maxconsonent=Math.max(maxconsonent,consonent[i]);
        }
        return maxvowel+maxconsonent;
    }
}