package com.leetcode.hot;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 * @author
 * @date 2020/4/20
 */
public class LeetCode_155_MinStack {


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty()) {
            stack2.push(x);
        } else {
            int min = stack2.peek();
            stack2.push(Math.min(min, x));
        }
    }

    public void pop() {
        if (!stack1.isEmpty()) {
            stack1.pop();
            stack2.pop();
        }
    }

    public int top() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        throw new RuntimeException("栈为空，不能进行次操作");
    }

    public int getMin() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        throw new RuntimeException("栈为空，不能进行次操作");
    }
}
