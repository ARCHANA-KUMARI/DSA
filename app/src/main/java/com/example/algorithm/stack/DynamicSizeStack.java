package com.example.algorithm.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Dynamic size stack but no thread safe.
 * @Author: Archana Kumari
 * @Date: 13-11-2022
 */
public class DynamicSizeStack<T> {
    private int mCapacityIncreament;
    private Object[] mElementData;
    private int mTop = -1;
    // Default capacity of Stack
    private static int CAPACITY = 10;

    public DynamicSizeStack(int initialCapacity, int capacityIncreament) {
        CAPACITY = initialCapacity;
        this.mCapacityIncreament = capacityIncreament;
    }

    public DynamicSizeStack(int capacityIncreament) {
        this.mCapacityIncreament = capacityIncreament;
        mElementData = new Object[mCapacityIncreament];
    }

    public DynamicSizeStack() {
        this(CAPACITY);
    }

    public void push(T data) {
        if (CAPACITY - (mTop + 1) == 0) {
            mElementData = Arrays.copyOf(mElementData, mTop + mCapacityIncreament);
        }
        mTop = mTop + 1;
        mElementData[mTop] = data;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = (T) mElementData[mTop];
        System.out.println("data = " + data + "Top is" + mTop);
        mElementData[mTop] = null;
        mTop = mTop - 1;
        return data;
    }

    private boolean isEmpty() {
        if (mTop == -1)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "DynamicSizeStack{" +
                "mElementData=" + Arrays.toString(mElementData) +
                '}';
    }

    public int size(){
        return mTop + 1;
    }
}
