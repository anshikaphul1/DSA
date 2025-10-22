class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // Map<Character,Integer> count=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     count.put(ch,count.getOrDefault(ch,0) +1);
        // }
        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     if(!count.containsKey(ch) || count.get(ch)==0){
        //         return false;
        //     }
        //     count.put(ch,count.get(ch)-1);
        // }
        // return true;

        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }
}