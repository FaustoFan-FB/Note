package kotlin_way.linkedlist

import kotlin_way.DataStructure


/**
 * @author: fausto
 * @date: 2021/10/5 16:15
 * @description:
 */
interface LinkedList<T> : DataStructure<LinkedList.Node<T>> {
    class Node<T>(var data: T) {
        var next: Node<T>? = null
        override fun toString(): String {
            return "Node(data=$data)"
        }

    }

    val head: Node<T>

    fun add(node: Node<T>)

    fun del(no: Int)

    fun update(newNode: Node<T>)

    override fun addData(data: Node<T>) {
        add(data)
    }

    override fun peek(): Node<T> {
        return head.next!!
    }

    //显示链表[遍历]
    override fun list() {
        //判断链表是否为空
        if (head.next == null) {
            println("链表为空,无数据显示...")
            return
        }
        //定义辅助变量
        var temp = head.next
        while (temp != null) {
            //输出节点信息
            println(temp)
            temp = temp.next
        }
    }
}

fun main() {
    val h1 = LinkedList.Node(Hero(1, "宋江", "及时雨"))
    val h2 = LinkedList.Node(Hero(2, "卢俊义", "玉麒麟"))
    val h3 = LinkedList.Node(Hero(3, "吴用", "智多星"))
    val h4 = LinkedList.Node(Hero(4, "林冲", "豹子头"))

    var singleLinkedList = SingleLinkedList()/*.apply {
        add(h1)
        add(h4)
        add(h3)
        add(h2)
    }.also { it.list() }*/

    singleLinkedList.apply {
        addByOrder(h1)
        addByOrder(h4)
        addByOrder(h2)
        addByOrder(h3)
        update(LinkedList.Node(Hero(1, "宋江江", "及时雨~~~")))
    }.also { it.list() }.apply {
        del(2)
    }.let {
        it.list()
    }

}

