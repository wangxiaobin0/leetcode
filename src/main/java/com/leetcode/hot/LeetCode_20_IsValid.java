package com.leetcode.hot;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * @author
 * @date 2020/4/20
 */
public class LeetCode_20_IsValid {

    public static boolean isValid(String str) {
        int len;
        if ((len = str.length()) % 2 == 1) {
            return false;
        }
        //记录括号的对应关系
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        //利用栈先进后出的特点
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            //包含key说明是左括号
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                //栈为空，则右括号是第一个，false；不为空则取出栈顶括号看看与c匹配不匹配
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        //括号必须全部出栈，才正好匹配
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
    }
}
