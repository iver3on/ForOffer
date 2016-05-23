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
		//判断是不是环形链表
		System.out.println(isCycle(node1));
		//ListNode node = findkthToTail(node1,2);
		//System.out.println(node.val);
	}

	//判断是不是环形链表
	private static boolean isCycle(ListNode node1) {
		//快指针 一次走两步
		ListNode fast = node1;
		//慢指针 一次走一步
		ListNode slow = node1;
		
		while(fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow){
				return true;
			}
		}
		return false;
	}
	
	//双指针思想第一个指针向前走k-1，第二个指针保持不动，从第k步开始，第二个指针也开始从链表的头开始遍历。由于两个指针相差k-1，当第一个指针到达链表的末尾节点
	//第二个指针刚好到达倒数第k个节点
	private static ListNode findkthToTail(ListNode node1, int k) {
		//代码的鲁棒性最重要了，要时刻记得边界条件，即使做出来，代码鲁棒不高，也是很失败的。
		if(node1==null||k==0){
			return null;
		}
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
