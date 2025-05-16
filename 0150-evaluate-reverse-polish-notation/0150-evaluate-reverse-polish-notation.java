class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String token : tokens){
            if("+-*/".contains(token)){
                int a = stack.pop();
                int b = stack.pop();
                int result = 0;
                switch(token){
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = b / a; break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }
}