package com.fausto.classic;

/**
 * @author: fausto
 * @date: 2021/9/9 14:36
 * @description: ����ķ�㷨_��·����(��С������)
 */
public class Prim {
}

record Person(String name, int age) {
}

class test {
	
	
	public static void main(String[] args) {
		Person p = new Person("fausto", 18);
		
		System.out.println(p);
	}
}