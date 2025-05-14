class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        if(s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                if ((s.charAt(i) == '}' && stack.pop() != '{')
               || (s.charAt(i) == ']' && stack.pop() != '[')
               || (s.charAt(i) == ')' && stack.pop() != '(')){
                return false;
               }
            }
        }
        return stack.isEmpty();  
    }
}