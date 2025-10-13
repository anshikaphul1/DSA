class Solution {
    public List<String> removeAnagrams(String[] words) {
        int curr=1;
        int prev=0;
        List<String>result=new ArrayList<>();
        result.add(words[0]);
        while(curr<words.length){
            if(!isAnagram(words[curr],words[prev])){
                result.add(words[curr]);
                prev=curr;
            }
            curr++;
        }
        return result;
    }
    public static boolean isAnagram(String w1, String w2){
        char[] c1=w1.toCharArray();
        char[] c2=w2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}