package kotlin_way.queue

import kotlin_way.DataStructure

/**
 * @author: fausto
 * @date: 2021/10/5 15:31
 * @description:
 */
interface Queue : DataStructure<Int> {
    //队列容量
    var maxSize: Int

    //指向队列的第一个元素
    var front: Int

    //指向队列的最后一个元素的后一个位置
    var rear: Int

    //存放数据,模拟队列
    val arr: Array<Int>

    //判断结构中数据是否为空
    fun isEmpty(): Boolean

    //判断结构中数据是否满
    fun isFull(): Boolean


}