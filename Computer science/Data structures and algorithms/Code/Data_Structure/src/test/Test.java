package test;

import kotlin_way.DataStructure;
import kotlin_way.queue.CircleArrayQueue;

import java.util.Scanner;

/**
 * @param :
 *
 * @return: null
 * @author: fausto
 * @date: 2021/8/5 21:04
 * @description:
 */
class Test {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean flag = true;
		int n;
		
		while (flag) {
			System.out.println("输入1,测试ArrayQueue...\n输入2,测试CircleArrayQueue...\n输入0,退出...");
			n = scanner.nextInt();
			
			switch (n) {
				
				case 1:
					//test(new ArrayQueue(3));
					System.out.println("已取消此测试...");
					break;
				
				case 2:
					test(new CircleArrayQueue(5));
					break;
				
				case 0:
					scanner.close();
					flag = false;
					break;
				
				default:
					break;
			}
			System.out.println("程序结束...");
		}
		
	}
	
	public static void test(DataStructure structure) {
		char key = ' ';
		boolean loop = true;
		
		while (loop) {
			System.out.println("s(show): 显示队列");
			System.out.println("e(exit): 退出程序");
			System.out.println("a(add): 添加数据到队列");
			System.out.println("g(get): 从队列取出数据");
			System.out.println("h(head): 查看队列头数据");
			key = scanner.next().charAt(0);
			switch (key) {
				
				case 's':
					structure.list();
					break;
				
				case 'a':
					System.out.println("输入一个数据");
					int value = scanner.nextInt();
					structure.addData(value);
					break;
				
				case 'g':
					try {
						int res = (Integer) structure.getData();
						System.out.printf("去除的数据是%d\n", res);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				
				case 'h':
					try {
						int res = (Integer) structure.peek();
						System.out.printf("队列头的数据是%d\n", res);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				
				case 'e':
					loop = false;
					break;
				
				default:
					break;
			}
		}
		
		System.out.println("程序退出~~");
	}
}
