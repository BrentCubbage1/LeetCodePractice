package Questions.MakeQueueUsingStack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        this.stack1.push(x);
    }

    public int pop() {
        while (this.stack1.size() != 0){
            this.stack2.push(this.stack1.pop());
        }

        int result = this.stack2.pop();

        while (this.stack2.size() != 0){
            this.stack1.push(this.stack2.pop());
        }


        return result;
    }

    public int peek() {
        while (this.stack1.size() != 0){
            this.stack2.push(this.stack1.pop());
        }

        int result = this.stack2.peek();

        while (this.stack2.size() != 0){
            this.stack1.push(this.stack2.pop());
        }


        return result;

    }

    public boolean empty() {
        return this.stack1.size() == 0;
    }
}
