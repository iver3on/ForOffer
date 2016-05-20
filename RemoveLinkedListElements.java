package net.zwb;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		/*
		 * ListNode node2 = new ListNode(2); ListNode node3 = new ListNode(3);
		 * ListNode node4 = new ListNode(4); ListNode node5 = new ListNode(5);
		 * ListNode node6 = new ListNode(6); ListNode node7 = new ListNode(3);
		 * ListNode node8 = new ListNode(1); node1.next = node2; node2.next =
		 * node3; node3.next = node4; node4.next = node5; node5.next = node6;
		 * node6.next = node7; node7.next = node8;
		 */
		print(node1);
//		ListNode n = removeElements(node1, 1);
//		System.out.println();
		ListNode n = removeNode(node1, node2);
		print(n);
	}

	public static void print(ListNode head) {
		ListNode node = head;
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode node = head;
		ListNode preNode = head;
		while (node != null) {
			if (node.val == val) {
				preNode.next = node.next;
				node = node.next;
			} else if (node.val != val) {
				preNode = node;
				node = node.next;
			}
		}
		return head;
	}
	
	
	//o(N)时间复杂度删除节点  很nice
	public static ListNode removeNode(ListNode head,ListNode pTobeDeleted){
		if(head==null||pTobeDeleted==null){
			return head;
		}
		if(pTobeDeleted.next!=null){
			ListNode pNext = pTobeDeleted.next;
			pTobeDeleted.val = pNext.val;
			pTobeDeleted.next = pNext.next;
		}
		return head;
	}
	
}
