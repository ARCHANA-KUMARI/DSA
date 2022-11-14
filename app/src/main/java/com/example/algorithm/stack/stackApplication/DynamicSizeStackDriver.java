package com.example.algorithm.stack.stackApplication;

import com.example.algorithm.stack.DynamicSizeStack;

/**
 * @Author: Archana Kumari
 * @Date: 14-11-2022
 */
public class DynamicSizeStackDriver {
    public static void main(String[] args) {
        //Default size stack
        DynamicSizeStack<Integer> stack = new DynamicSizeStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack);
        System.out.println("Popped item is" + stack.pop());
        System.out.println(stack);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        System.out.println("Stack size:" + stack.size());

        // Stack increased by 10
    }
}
