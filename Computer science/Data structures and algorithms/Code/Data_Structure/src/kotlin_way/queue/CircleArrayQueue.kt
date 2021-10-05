package kotlin_way.queue

/**
 * @author: fausto
 * @date: 2021/10/5 12:09
 * @description: 数组循环队列,构造器需要传入数组的最大容量
 */
class CircleArrayQueue(override var maxSize: Int) : Queue {

    //指向队列的第一个元素
    override var front: Int = 0

    //指向队列的最后一个元素的后一个位置
    override var rear: Int = 0

    //存放数据,模拟队列
    override val arr: Array<Int> = Array(maxSize) { it }


    override fun isEmpty(): Boolean {
        return rear == front
    }

    override fun isFull(): Boolean {
        return (rear + 1) % maxSize == front
    }

    override fun addData(data: Int) {
        if (isFull()) {
            println("队列满,不能加入新数据!!!")
            return
        }
        arr[rear] = data
        rear = (rear + 1) % maxSize
    }

    override fun getData(): Int {
        if (isEmpty()) throw RuntimeException("队列空,无法再取出数据!!!")
        val value = arr[front]
        front = (front + 1) % maxSize
        return value
    }

    override fun list() {
        if (isEmpty()) {
            println("队列空,无法打印数据...")
            return
        }
        for (i in front until front + size()) {
            println("arr[${i % maxSize}] = ${arr[i % maxSize]}")
        }
    }

    override fun peek(): Int {
        if (isEmpty()) throw RuntimeException("队列空,无数据读取...")
        return arr[front]
    }

    private fun size(): Int {
        return (rear + maxSize - front) % maxSize
    }
}