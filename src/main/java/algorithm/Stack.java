package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    LinkedList<Integer> mainQueue;
    LinkedList<Integer> subQueue;

    public Stack() {
        mainQueue = new LinkedList<>();
        subQueue = new LinkedList<>();
    }

    public void push(int v) {
        if (mainQueue.isEmpty()) {
            mainQueue.offer(v);
        } else {
            while (!mainQueue.isEmpty()) {
                subQueue.offer(mainQueue.poll());
            }
            mainQueue.offer(v);
            while (!subQueue.isEmpty()) {
                mainQueue.offer(subQueue.poll());
            }
        }
    }

    public int pop() {
        return mainQueue.poll();
    }
}
