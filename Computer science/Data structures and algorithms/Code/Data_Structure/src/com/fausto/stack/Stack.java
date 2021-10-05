package com.fausto.stack;

import com.fausto.DataStructure;

/**
 * @author: fausto
 * @date: 2021/8/6 10:05
 * @description:
 */
public interface Stack extends DataStructure {
	
	void push(int data);
	
	int pop();
	
}
