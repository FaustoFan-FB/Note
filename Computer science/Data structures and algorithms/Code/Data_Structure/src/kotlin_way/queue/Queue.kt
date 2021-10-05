package kotlin_way.queue

import kotlin_way.DataStructure

/**
 * @author: fausto
 * @date: 2021/10/5 15:31
 * @description:
 */
interface Queue : DataStructure<Int> {
    //��������
    var maxSize: Int

    //ָ����еĵ�һ��Ԫ��
    var front: Int

    //ָ����е����һ��Ԫ�صĺ�һ��λ��
    var rear: Int

    //�������,ģ�����
    val arr: Array<Int>

    //�жϽṹ�������Ƿ�Ϊ��
    fun isEmpty(): Boolean

    //�жϽṹ�������Ƿ���
    fun isFull(): Boolean


}