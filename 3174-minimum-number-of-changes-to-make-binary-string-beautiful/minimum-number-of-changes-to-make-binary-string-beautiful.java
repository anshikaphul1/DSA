class Solution {
    public int minChanges(String s) {
        int changeneeded=0;
        for(int i=0;i<s.length();i+=2){
            changeneeded+=s.charAt(i)^s.charAt(i+1);
        }
        return changeneeded;
    }
}