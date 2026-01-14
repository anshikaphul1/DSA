class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        if(s.length()<=1) return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stk.push(ch);
            }
            else if(stk.isEmpty()) return false;
            else{
                if(ch==')'){
                    if(stk.peek()!='('){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stk.peek()!='['){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stk.peek()!='{'){
                        return false;
                    }
                }
                stk.pop();
            }
            //  stk.pop();
        }
        return stk.isEmpty();
    }
}