class Solution {
    public String frequencySort(String s) {
        // char ch=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // int maxi=0;
        // for(Map.Entry<Character,Integer>entry:map.entrySet()){
        //     maxi=Math.max(maxi,entry.getValue());
        // }
        StringBuilder result=new StringBuilder();
        for(int i=s.length();i>=0;i--){
            for(Map.Entry<Character,Integer>entry:map.entrySet()){
                if(entry.getValue()==i){
                    for(int j=0;j<i;j++){
                        result.append(entry.getKey());
                    }
                }
            }
        }
        return result.toString();
    }
}