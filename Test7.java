/**
 * 翻转链表  要三个指针。。防止链表断裂  使用栈是愚蠢的做法。
 */
package net.getOffer;

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public class Test7 {

	/**
	 * @param args
	 */
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
		ListNode node = reverseList(node1);
		print(node);
	}

	/**
	 * @param node1
	 * @return
	 */
	private static ListNode reverseList(ListNode node1) {
		ListNode reverseHead = null;
		ListNode pNode = node1;
		ListNode pRrev = null;
		while(pNode!=null){
			ListNode pNext = pNode.next;
			if(pNext==null) reverseHead = pNode;
			pNode.next = pRrev;
			pRrev = pNode;
			pNode = pNext;
		}	
		return reverseHead;
	}

	public static void print(ListNode node){
		ListNode head = node;
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
	
}
