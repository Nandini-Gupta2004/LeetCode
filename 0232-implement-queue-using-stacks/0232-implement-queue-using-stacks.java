class MyQueue {
    Stack<Integer> st;
    Stack<Integer> help=new Stack<>();

    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
         st.push(x);
    }
    
    public int pop() {
        while(st.size()>1) help.push(st.pop());
        int x=st.peek();
        st.pop();
        while(!help.isEmpty()) st.push(help.pop());
        return x;
    }
    
    public int peek() {
         while(st.size()>1) help.push(st.pop());
         int x=st.peek();
         while(!help.isEmpty()) st.push(help.pop());
        return x;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */