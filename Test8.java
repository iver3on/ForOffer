/**
 * 合并两个有序的单链表 合并后仍然有序
 * 类似归并算法
 */
package net.getOffer;

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月23日
 */
public class Test8 {

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
		ListNode node6 = new ListNode(1);
		ListNode node7 = new ListNode(2);
		ListNode node8 = new ListNode(3);
		ListNode node9 = new ListNode(4);
		ListNode node10 = new ListNode(5);
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		ListNode node = merge(node1,node6);
		Test7.print(node);
	}

	/**
	 * @param node1
	 * @param node6
	 * @return
	 */
	private static ListNode merge(ListNode node1, ListNode node6) {
		if(node1==null){
			return node6;
		}else if(node6==null){
			return node1;
		}
		
		ListNode pMergehead = null;
		if(node1.val<node6.val){
			pMergehead = node1;
			pMergehead.next = merge(node1.next, node6);
		}else{
			pMergehead = node6;
			pMergehead.next = merge(node1, node6.next);
		}	
		return pMergehead;
	}

}
