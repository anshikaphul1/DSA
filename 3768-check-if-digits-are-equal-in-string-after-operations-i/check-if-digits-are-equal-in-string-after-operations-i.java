class Solution {
    public boolean hasSameDigits(String s) {
        // int n=s.length();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=s.charAt(i)-'0';
        // }
        // while(n>2){
        //     for(int i=0;i<n-1;i++){
        //         arr[i]=(arr[i]+arr[i+1])%10;
        //     }
        //     n--;
        // }
        // return arr[0]==arr[1];


        while(s.length()>2){
            StringBuilder string=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int a=s.charAt(i)-'0';
                int b=s.charAt(i+1)-'0';
                string.append((a+b)%10);
            }
            s=string.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}