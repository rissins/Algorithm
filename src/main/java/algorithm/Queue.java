package algorithm;

import java.util.Stack;

public class Queue {
    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public Queue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void enQueue(int v) {
        stackA.push(v);
    }

    public int deQueue() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }
}
