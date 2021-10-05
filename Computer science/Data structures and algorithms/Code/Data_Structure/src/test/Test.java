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
			System.out.println("����1,����ArrayQueue...\n����2,����CircleArrayQueue...\n����0,�˳�...");
			n = scanner.nextInt();
			
			switch (n) {
				
				case 1:
					//test(new ArrayQueue(3));
					System.out.println("��ȡ���˲���...");
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
			System.out.println("�������...");
		}
		
	}
	
	public static void test(DataStructure structure) {
		char key = ' ';
		boolean loop = true;
		
		while (loop) {
			System.out.println("s(show): ��ʾ����");
			System.out.println("e(exit): �˳�����");
			System.out.println("a(add): ������ݵ�����");
			System.out.println("g(get): �Ӷ���ȡ������");
			System.out.println("h(head): �鿴����ͷ����");
			key = scanner.next().charAt(0);
			switch (key) {
				
				case 's':
					structure.list();
					break;
				
				case 'a':
					System.out.println("����һ������");
					int value = scanner.nextInt();
					structure.addData(value);
					break;
				
				case 'g':
					try {
						int res = (Integer) structure.getData();
						System.out.printf("ȥ����������%d\n", res);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				
				case 'h':
					try {
						int res = (Integer) structure.peek();
						System.out.printf("����ͷ��������%d\n", res);
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
		
		System.out.println("�����˳�~~");
	}
}
