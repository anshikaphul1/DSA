class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            char l=s.charAt(low);
            char h=s.charAt(high);
            if(!Character.isLetterOrDigit(l)){
                low++;
            }
            else if(!Character.isLetterOrDigit(h)){
                high--;
            }
            else if(Character.toLowerCase(l)!=Character.toLowerCase(h)) {
                return false;
            }else{
            low++;
            high--;
            }
        }
        return true;
    }
}