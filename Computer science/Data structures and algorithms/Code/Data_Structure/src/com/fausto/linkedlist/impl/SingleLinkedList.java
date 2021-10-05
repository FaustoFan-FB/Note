package com.fausto.linkedlist.impl;

import java.util.Map;

/**
 * @author: fausto
 * @date: 2021/8/3 8:58
 * @description:
 */
public class SingleLinkedList {
	private Node head; //头节点
	
	public SingleLinkedList() {
	}
	
	public SingleLinkedList(Node head) {
		this.head = head;
	}
	
	public void add(Node newNode) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void addByOrder(Node newNode) {
		Node temp = head;
		boolean flag = false;
		while (true) {
			if (temp.next == null) {
				break; //
			}
			if ((Integer) temp.next.data.get("no") > (Integer) newNode.data.get("no")) {
				break;
			} else if ((Integer) temp.next.data.get("no") == (Integer) newNode.data.get("no")) {
				
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			System.out.printf("׼�������Ӣ�۵ı�� %d �Ѿ�������, ���ܼ���\n", newNode.data.get("no"));
		} else {
			
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void update(Node newNode) {
		
		if (head.next == null) {
			System.out.println("����Ϊ��~");
			return;
		}
		
		Node temp = head.next;
		boolean flag = false;
		while (true) {
			if (temp == null) {
				break;
			}
			if ((Integer) temp.data.get("no") == (Integer) newNode.data.get("no")) {
				
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			temp.data.put("name", newNode.data.get("name"));
			temp.data.put("nickName", newNode.data.get("nickName"));
		} else { //û���ҵ�
			System.out.printf("û���ҵ� ��� %d �Ľڵ㣬�����޸�\n", newNode.data.get("no"));
		}
	}
	
	public void del(int no) {
		Node temp = head;
		boolean flag = false;
		while (true) {
			if (temp.next == null) {
				break;
			}
			if ((Integer) temp.next.data.get("no") == no) {
				
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			temp.next = temp.next.next;
		} else {
			System.out.printf("Ҫɾ���� %d �ڵ㲻����\n", no);
		}
	}
	
	public void list() {
		
		if (head.next == null) {
			System.out.println("����Ϊ��");
			return;
		}
		
		Node temp = head.next;
		while (true) {
			
			if (temp == null) {
				break;
			}
			
			System.out.println(temp);
			
			temp = temp.next;
		}
	}
	
	//定义节点
	public class Node {
		private Map data; //数据域
		private Node next; //指针域
		
		public Node() {
			data.put("no", 0);
			data.put("name", "");
			data.put("nickName", "");
		}
	}
}
