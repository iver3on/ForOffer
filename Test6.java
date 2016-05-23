package net.getOffer;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class Test6 {

	//�õ���������k���ڵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode node = findkthToTail(node1,2);
		System.out.println(node.val);
	}

	
	//˫ָ��˼���һ��ָ����ǰ��k-1���ڶ���ָ�뱣�ֲ������ӵ�k����ʼ���ڶ���ָ��Ҳ��ʼ�������ͷ��ʼ��������������ָ�����k-1������һ��ָ�뵽�������ĩβ�ڵ�
	//�ڶ���ָ��պõ��ﵹ����k���ڵ�
	private static ListNode findkthToTail(ListNode node1, int k) {
		ListNode begin = node1;
		ListNode behind = null;
		for(int i=0;i<k-1;i++){
			begin = node1.next;
		}
		behind = node1;
		while(begin.next!=null){
			begin = begin.next;
			behind = behind.next;
		}	
		return behind;
	}

}
