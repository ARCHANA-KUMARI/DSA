package com.example.algorithm.stack;

/** Fixed Size stack implementation
 * @Author: Archana Kumari
 * @Date: 18-10-2022
 */
public class Stack {
    private final int SIZE;
    private int container[];
    private int top = -1;

    public Stack(int size) {
        SIZE = size;
        container = new int[SIZE];
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        container[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = container[top];
        top = top - 1;
        return data;
    }

    private boolean isEmpty() {
        if (top == -1)
            return true;
        else return false;
    }

    private boolean isFull() {
        if (top == SIZE - 1)
            return true;
        else return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return container[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(container[i] + "\t");
        }
        System.out.println();
    }
}
