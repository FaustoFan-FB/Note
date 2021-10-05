package com.fausto.queue.arrayImpl;

import com.fausto.queue.Queue;

/**
 * @author: fausto
 * @date: 2021/8/5 19:49
 * @description: ������ģ�����, ȱ����ֻ��ʹ��һ��
 */
public class ArrayQueue implements Queue {
	private int maxSize; //�������
	private int front;   //ͷָ��
	private int rear;    //βָ��
	private int[] arr;   //������ģ�����
	
	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		front = -1;      //ָ�����ͷ��ǰһ��λ��
		rear = -1;       //ָ�����β
	}
	
	/**
	 * @return: boolean ��Ϊ��,��Ϊ����
	 * @author: fausto
	 * @date: 2021/8/5 20:00
	 * @description: �ж϶����Ƿ�Ϊ��
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
	
	// ������ݵ�����2
	public void addQueue(int data) {
		// �ж϶����Ƿ���
		if (isFull()) {
			System.out.println("������,�޷����������~");
			return;
		}
		arr[++rear] = data; //βָ����Ƶĺ�ֵ��������ݵ���β
	}
	
	// ���ݴӶ�ͷ����
	public int getQueue() {
		// �ж϶����Ƿ�Ϊ��
		if (isEmpty()) {
			// ���쳣
			throw new RuntimeException("�����ѿ�,�����ݳ���");
		}
		return arr[++front]; //��ͷָ����һ��λ�õ����ݵ���,ͬʱָ�����
		
	}
	
	// ��ʾ������������
	public void list() {
		if (isEmpty()) {
			System.out.println("�����ǿյ�,�����ݿ�չʾ~~");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}
	}
	
	// ��ʾ��ͷ����
	public int peek() {
		// ����
		if (isEmpty()) {
			throw new RuntimeException("���п�,û������~");
		}
		return arr[front + 1];
	}
	
}

