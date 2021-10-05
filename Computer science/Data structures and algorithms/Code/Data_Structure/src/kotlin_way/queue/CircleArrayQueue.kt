package kotlin_way.queue

/**
 * @author: fausto
 * @date: 2021/10/5 12:09
 * @description: ����ѭ������,��������Ҫ����������������
 */
class CircleArrayQueue(override var maxSize: Int) : Queue {

    //ָ����еĵ�һ��Ԫ��
    override var front: Int = 0

    //ָ����е����һ��Ԫ�صĺ�һ��λ��
    override var rear: Int = 0

    //�������,ģ�����
    override val arr: Array<Int> = Array(maxSize) { it }


    override fun isEmpty(): Boolean {
        return rear == front
    }

    override fun isFull(): Boolean {
        return (rear + 1) % maxSize == front
    }

    override fun addData(data: Int) {
        if (isFull()) {
            println("������,���ܼ���������!!!")
            return
        }
        arr[rear] = data
        rear = (rear + 1) % maxSize
    }

    override fun getData(): Int {
        if (isEmpty()) throw RuntimeException("���п�,�޷���ȡ������!!!")
        val value = arr[front]
        front = (front + 1) % maxSize
        return value
    }

    override fun list() {
        if (isEmpty()) {
            println("���п�,�޷���ӡ����...")
            return
        }
        for (i in front until front + size()) {
            println("arr[${i % maxSize}] = ${arr[i % maxSize]}")
        }
    }

    override fun peek(): Int {
        if (isEmpty()) throw RuntimeException("���п�,�����ݶ�ȡ...")
        return arr[front]
    }

    private fun size(): Int {
        return (rear + maxSize - front) % maxSize
    }
}