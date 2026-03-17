class Solution {
    public int firstUniqChar(String s) {
        // int[]freq=new int[26];
        // for(char ch:s.toCharArray()){
        //     freq[ch-'a']++;
        // }
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     if(freq[s.charAt(i)-'a']==1){
        //         return i;
        //     }
           
        // }
        // return -1 ;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}