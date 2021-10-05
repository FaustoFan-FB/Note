package kotlin_way

/**
 * @author: fausto
 * @date: 2021/10/5 12:02
 * @description: 数据结构接口
 */
open interface DataStructure<T> {

    //往结构中添加数据
    fun addData(data: T)

    //从结构中取出数据
    fun getData(): T

    //打印结构中所有数据
    fun list()

    //查看结构中第一个数据
    fun peek(): T
}