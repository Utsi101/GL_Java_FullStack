package com.greatlearning.lab3.dsa.question1;

import java.util.Stack;

public class BalancingOfBrackets {

	public static void main(String[] args) {
		// HardCoded input
		// Enter your input here:
		String input = "([[{}]])";
		boolean result = isBalancedBracketsExp(input);
		if (result) {
			System.out.println("The entered String is balanced.");
		} else {
			System.out.println("The entered string is not balanced.");
		}

	}

	public static boolean isBalancedBracketsExp(String input) {

		Stack<Character> data = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				data.push(ch);
				continue;
			}
			if (data.isEmpty()) {
				return false;
			}
			char matchCh = data.pop();
			switch (ch) {
			case ')':
				if (matchCh != '(') {
					return false;
				}
				break;
			case ']':
				if (matchCh != '[') {
					return false;
				}
				break;
			case '}':
				if (matchCh != '{') {
					return false;
				}
				break;
			}
		}
		return data.isEmpty();
	}

}
