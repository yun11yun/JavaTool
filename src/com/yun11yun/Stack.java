package com.yun11yun;


import java.util.Arrays;
import java.util.List;


public class Stack<E> {

    private Object[] elementData;

    private int size;

    public Stack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }

        elementData = new Object[initialCapacity];
    }

    public Stack(List<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        } else {
            throw new IllegalArgumentException("Illegal List:" + c.toString());
        }
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean push(E element) {
        if (size == elementData.length) {
            throw new StackOverflowError();
        }

        size ++;
        elementData[size - 1] = element;
        return true;
    }

    public E pop() {
        if (size == 0) {
            return null;
        }

        E obj = (E)elementData[size - 1];
        size --;
        return obj;
    }

    public E top() {
        if (size == 0) {
            return null;
        }

        return (E)elementData[size - 1];
    }

    public int size() {
        return size;
    }
}
