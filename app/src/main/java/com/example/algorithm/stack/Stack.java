package com.example.algorithm.stack;

/** Fixed Size stack implementation
 * @Author: Archana Kumari
 * @Date: 18-10-2022
 */
public class Stack {
    private final int SIZE;
    private int mContainer[];
    private int mTop = -1;

    public Stack(int size) {
        SIZE = size;
        mContainer = new int[SIZE];
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        mTop = mTop + 1;
        mContainer[mTop] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = mContainer[mTop];
        mTop = mTop - 1;
        return data;
    }

    private boolean isEmpty() {
        if (mTop == -1)
            return true;
        else return false;
    }

    private boolean isFull() {
        if (mTop == SIZE - 1)
            return true;
        else return false;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return mContainer[mTop];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return;
        }
        for (int i = 0; i <= mTop; i++) {
            System.out.print(mContainer[i] + "\t");
        }
        System.out.println();
    }
}
