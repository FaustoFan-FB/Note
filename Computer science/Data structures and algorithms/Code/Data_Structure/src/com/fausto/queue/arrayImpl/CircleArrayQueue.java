package com.fausto.queue.arrayImpl;

import com.fausto.queue.Queue;

/**
 * @author: fausto
 * @date: 2021/8/5 20:52
 * @description:
 */
public class CircleArrayQueue implements Queue {
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public void addData(int data) {
		addQueue(data);
	}
	
	@Override
	public int getData() {
		return getQueue();
	}
	
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public void addQueue(int data) {
	
	}
	
	@Override
	public int getQueue() {
		return 0;
	}
	
	@Override
	public void list() {
	
	}
	
	@Override
	public int peek() {
		return 0;
	}
	
}
