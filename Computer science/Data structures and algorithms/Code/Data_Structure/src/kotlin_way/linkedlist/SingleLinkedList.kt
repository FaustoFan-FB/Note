package kotlin_way.linkedlist

/**
 * @author: fausto
 * @date: 2021/10/5 13:47
 * @description:
 */
class SingleLinkedList(
    override val head: LinkedList.Node<Hero> = LinkedList.Node(Hero()),
) : LinkedList<Hero> {

    //往链表的最后添加节点
    override fun add(heroNode: LinkedList.Node<Hero>) {
        //头节点不能动,借助辅助节点遍历链表
        var temp = head
        //将temp往后移,直至指向最后一个节点
        while (temp.next != null) temp = temp.next!!
        //此时temp指向链表的最后一个节点
        temp.next = heroNode
    }

    //根据英雄序号插入到指定位置
    //如果该序号已存在,则添加失败
    fun addByOrder(heroNode: LinkedList.Node<Hero>) {
        var temp = head
        //flag标识添加的序号是否已存在,默认不存在为false
        var flag = false
        while (temp.next != null) {
            if (temp.next!!.data.no > heroNode.data.no) {
                //位置找到,就在temp的后面插入
                break
            } else if (temp.next!!.data.no == heroNode.data.no) {
                //说明该序号已经存在
                flag = true
                break
            }
            temp = temp.next!!
        }
        //判断flag的值
        if (flag) {
            //该序号已存在,无法添加
            println("准备插入的英雄序号: ${heroNode.data.no} 已存在,无法添加...")
        } else {
            //插入到链表中,temp的后面
            heroNode.next = temp.next
            temp.next = heroNode
        }
    }

    //修改节点的信息,根据no序号修改,即no序号不能改
    override fun update(newHeroNode: LinkedList.Node<Hero>) {
        //判断链表是否为空
        if (head.next == null) {
            println("链表为空,无法修改...")
            return
        }
        //根据no序号找到需要修改的节点
        //定义辅助变量
        var temp = head.next
        //标识是否找到该节点
        var flag = false
        while (temp != null) {
            if (temp.data.no == newHeroNode.data.no) {
                //找到该节点
                flag = true
                break
            }
            temp = temp.next
        }
        //根据flag判断
        if (flag) {
            temp!!.data.name = newHeroNode.data.name
            temp!!.data.nickName = newHeroNode.data.nickName
        } else {
            //没有找到
            println("没有找到序号为: ${newHeroNode.data.no} 的节点,无法修改...")
        }
    }

    //删除节点
    //通过比较temp.next.data.no 和 需要删除节点的no
    override fun del(no: Int) {
        var temp = head
        //标识是否找到待删除节点
        var flag = false
        while (temp.next != null) {
            if (temp.next!!.data.no == no) {
                //找到待删除结点的前一个结点
                flag = true
                break
            }
            temp = temp.next!!
        }
        //判断flag
        if (flag) {
            //找到待删除节点的前一个节点,将其删除(断掉其链接引用使其游离,GC会将其回收)
            temp.next = temp.next!!.next
        } else {
            println("要删除的: ${no}节点不存在")
        }

    }

    override fun getData(): LinkedList.Node<Hero> {
        return LinkedList.Node(Hero())
    }
}

class Hero() {
    var no: Int = 0
    var name: String = ""
    var nickName: String = ""

    constructor(_no: Int, _name: String, _nickName: String) : this() {
        no = _no
        name = _name
        nickName = _nickName
    }

    override fun toString(): String {
        return "Hero(no=$no, name='$name', nickName='$nickName')"
    }

}
