package com.fausto;

/**
 * @author: fausto
 * @date: 2021/8/6 9:55
 * @description:
 */
public interface DataStructure {
	boolean isEmpty();
	
	boolean isFull();
	
	void addData(int data);
	
	int getData();
	
	void list();
	
	int peek();
}
