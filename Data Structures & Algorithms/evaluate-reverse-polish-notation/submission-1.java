class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        for(int i = 0 ; i < tokens.length;i++){
            String  sign = tokens[i];
            if(sign.equals("+")|| sign.equals("-") || sign.equals("*")|| sign.equals("/")){
                int a = st.pop();
                int b = st.pop();
                switch(sign){
                    case  "+":
                    st.push(a+b);
                    break;
                    case "-":
                    st.push(b-a);
                    break;
                    case "*":
                    st.push(a*b);
                    break;
                    case "/":
                    st.push(b/a);
                    break;
                }
            }else{
                st.push(Integer.parseInt(sign));
            }
        }
        return st.pop();
    }
}
