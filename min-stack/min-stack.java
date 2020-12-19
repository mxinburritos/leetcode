class MinStack {
    int minInd;
    TreeMap<Integer, Integer> min = new TreeMap<Integer, Integer>();
    java.util.Stack<Integer> stack = new java.util.Stack<>();
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        min.put(x, min.getOrDefault(x, 0) + 1);
        minInd = min.firstKey();
    }
    
    public void pop() {
        int popped = stack.pop();
        min.put(popped, min.get(popped) - 1);
        if(min.get(popped) < 1) {
            min.remove(popped);
        }
        if(min.size() != 0) {
            minInd = min.firstKey();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minInd;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
