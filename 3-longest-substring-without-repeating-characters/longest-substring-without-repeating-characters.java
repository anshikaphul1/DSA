class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int mx=0;
        HashSet<Character>set=new HashSet<>();
        for(j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            mx=Math.max(mx,j-i+1);
        }
        return mx;
    }
}