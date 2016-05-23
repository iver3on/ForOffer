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

	//得到链表倒数第k个节点
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

	
	//双指针思想第一个指针向前走k-1，第二个指针保持不动，从第k步开始，第二个指针也开始从链表的头开始遍历。由于两个指针相差k-1，当第一个指针到达链表的末尾节点
	//第二个指针刚好到达倒数第k个节点
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
