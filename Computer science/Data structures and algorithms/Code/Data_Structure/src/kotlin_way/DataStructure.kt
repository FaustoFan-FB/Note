package kotlin_way

/**
 * @author: fausto
 * @date: 2021/10/5 12:02
 * @description: ���ݽṹ�ӿ�
 */
open interface DataStructure<T> {

    //���ṹ���������
    fun addData(data: T)

    //�ӽṹ��ȡ������
    fun getData(): T

    //��ӡ�ṹ����������
    fun list()

    //�鿴�ṹ�е�һ������
    fun peek(): T
}