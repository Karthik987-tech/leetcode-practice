class MinStack {
    Stack<Integer> sta;
    Stack<Integer> stam;

    public MinStack() {
      sta=new Stack<>();
      stam=new Stack<>();
    }
    
    public void push(int val) {
       sta.push(val);
       if (stam.isEmpty() || val <= stam.peek()) {
            stam.push(val);
        }
    }
    
    public void pop() {
       int r = sta.pop();

        if (r == stam.peek()) {
            stam.pop();
        }
    }
    
    public int top() {
     return  sta.peek();  
    }
    
    public int getMin() {
      return stam.peek();  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
