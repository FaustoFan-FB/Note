package com.fausto.queue.arrayImpl;

import com.fausto.queue.Queue;

/**
 * @author: fausto
 * @date: 2021/8/5 19:49
 * @description: 用数组模拟队列, 缺陷是只能使用一次
 */
public class ArrayQueue implements Queue {
	private int maxSize; //最大容量
	private int front;   //头指针
	private int rear;    //尾指针
	private int[] arr;   //用数组模拟队列
	
	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		front = -1;      //指向队列头的前一个位置
		rear = -1;       //指向队列尾
	}
	
	/**
	 * @return: boolean 真为空,假为不空
	 * @author: fausto
	 * @date: 2021/8/5 20:00
	 * @description: 判断队列是否为空
	 */
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	
	@Override
	public void addData(int data) {
		addQueue(data);
	}
	
	@Override
	public int getData() {
		return getQueue();
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	// 添加数据到队列2
	public void addQueue(int data) {
		// 判断队列是否满
		if (isFull()) {
			System.out.println("队列满,无法再添加数据~");
			return;
		}
		arr[++rear] = data; //尾指针后移的后赋值即添加数据到队尾
	}
	
	// 数据从队头出队
	public int getQueue() {
		// 判断队列是否为空
		if (isEmpty()) {
			// 抛异常
			throw new RuntimeException("队列已空,将数据出队");
		}
		return arr[++front]; //将头指针下一个位置的数据弹出,同时指针后移
		
	}
	
	// 显示队列所有数据
	public void list() {
		if (isEmpty()) {
			System.out.println("队列是空的,无数据可展示~~");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}
	}
	
	// 显示队头数据
	public int peek() {
		// 遍历
		if (isEmpty()) {
			throw new RuntimeException("队列空,没有数据~");
		}
		return arr[front + 1];
	}
	
}

