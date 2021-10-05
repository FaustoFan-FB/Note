package kotlin_way.linkedlist

/**
 * @author: fausto
 * @date: 2021/10/5 13:47
 * @description:
 */
class SingleLinkedList(
    override val head: LinkedList.Node<Hero> = LinkedList.Node(Hero()),
) : LinkedList<Hero> {

    //������������ӽڵ�
    override fun add(heroNode: LinkedList.Node<Hero>) {
        //ͷ�ڵ㲻�ܶ�,���������ڵ��������
        var temp = head
        //��temp������,ֱ��ָ�����һ���ڵ�
        while (temp.next != null) temp = temp.next!!
        //��ʱtempָ����������һ���ڵ�
        temp.next = heroNode
    }

    //����Ӣ����Ų��뵽ָ��λ��
    //���������Ѵ���,�����ʧ��
    fun addByOrder(heroNode: LinkedList.Node<Hero>) {
        var temp = head
        //flag��ʶ��ӵ�����Ƿ��Ѵ���,Ĭ�ϲ�����Ϊfalse
        var flag = false
        while (temp.next != null) {
            if (temp.next!!.data.no > heroNode.data.no) {
                //λ���ҵ�,����temp�ĺ������
                break
            } else if (temp.next!!.data.no == heroNode.data.no) {
                //˵��������Ѿ�����
                flag = true
                break
            }
            temp = temp.next!!
        }
        //�ж�flag��ֵ
        if (flag) {
            //������Ѵ���,�޷����
            println("׼�������Ӣ�����: ${heroNode.data.no} �Ѵ���,�޷����...")
        } else {
            //���뵽������,temp�ĺ���
            heroNode.next = temp.next
            temp.next = heroNode
        }
    }

    //�޸Ľڵ����Ϣ,����no����޸�,��no��Ų��ܸ�
    override fun update(newHeroNode: LinkedList.Node<Hero>) {
        //�ж������Ƿ�Ϊ��
        if (head.next == null) {
            println("����Ϊ��,�޷��޸�...")
            return
        }
        //����no����ҵ���Ҫ�޸ĵĽڵ�
        //���帨������
        var temp = head.next
        //��ʶ�Ƿ��ҵ��ýڵ�
        var flag = false
        while (temp != null) {
            if (temp.data.no == newHeroNode.data.no) {
                //�ҵ��ýڵ�
                flag = true
                break
            }
            temp = temp.next
        }
        //����flag�ж�
        if (flag) {
            temp!!.data.name = newHeroNode.data.name
            temp!!.data.nickName = newHeroNode.data.nickName
        } else {
            //û���ҵ�
            println("û���ҵ����Ϊ: ${newHeroNode.data.no} �Ľڵ�,�޷��޸�...")
        }
    }

    //ɾ���ڵ�
    //ͨ���Ƚ�temp.next.data.no �� ��Ҫɾ���ڵ��no
    override fun del(no: Int) {
        var temp = head
        //��ʶ�Ƿ��ҵ���ɾ���ڵ�
        var flag = false
        while (temp.next != null) {
            if (temp.next!!.data.no == no) {
                //�ҵ���ɾ������ǰһ�����
                flag = true
                break
            }
            temp = temp.next!!
        }
        //�ж�flag
        if (flag) {
            //�ҵ���ɾ���ڵ��ǰһ���ڵ�,����ɾ��(�ϵ�����������ʹ������,GC�Ὣ�����)
            temp.next = temp.next!!.next
        } else {
            println("Ҫɾ����: ${no}�ڵ㲻����")
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
