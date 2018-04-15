package com.yun11yun;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {

    private Stack<String> stack;

    @Before
    public void setUp() {
        stack = new Stack <>(4);
    }

    @Test
    public void isEmpty() {

        assertTrue(stack.isEmpty());

        stack.push("huang");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void push() {

        stack.push("huang");
        assertEquals("huang", stack.top());
        assertEquals(1, stack.size());

        stack.push("wen");
        assertEquals("wen", stack.top());
        assertEquals(2, stack.size());
    }

    @Test (expected = Error.class)
    public void testPushStackOverflowError() {
        stack.push("huang");
        stack.push("wen");
        stack.push("tao");
        stack.push("yun");
        stack.push("yun");
        fail("当push操作超过stack的容量时没有抛出错误!");
    }

    @Test
    public void pop() {

        stack.push("金春晴");
        stack.push("金小亮");
        stack.push("金丹");

        assertEquals("金丹", stack.pop());
        assertEquals("金小亮", stack.pop());
        assertEquals("金春晴", stack.pop());
        assertNull(stack.pop());
    }
}