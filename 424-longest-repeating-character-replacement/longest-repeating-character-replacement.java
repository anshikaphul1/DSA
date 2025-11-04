class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        // int right=0;
        int maxlen=0;
        int maxfreq=0;
        int Acount=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq=Math.max(maxfreq,map.get(c));
            while((right-left+1)-maxfreq>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            // right++;
            maxlen=Math.max(maxlen,right-left+1);
            // right++;
        }
        return maxlen;
    }
}