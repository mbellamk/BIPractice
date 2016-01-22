package com.bellinfo.assignments;

public class Test {

	public static void main(String[] args) {

		LNode head = storeLinkedList1();
		LNode head1 = storeLinkedList2();
		LNode merged = merge(head1, head);
		do {
			if (merged != null) {
				System.out.println(merged.value);
				merged = merged.next;
			}
		} while (merged != null);
	}

	private static LNode merge(LNode head1, LNode head) {
		LNode startMergeNode = null, mergedLnode = null, previousMergedNode = null;

		boolean status = false;
		do {
			mergedLnode = new LNode();
			if (head1 != null && head != null) {
				if (head1.value <= head.value) {
					mergedLnode.value = head1.value;
					head1 = head1.next;
				} else if (head != null) {

					mergedLnode.value = head.value;
					head = head.next;

				}
			} else if (head != null) {
				mergedLnode.value = head.value;
				head = head.next;

			}else if (head1 != null) {
				mergedLnode.value = head1.value;
				head1 = head1.next;

			}
			if (previousMergedNode != null) {
				previousMergedNode.next = mergedLnode;
				previousMergedNode=previousMergedNode.next;
			} else {
				previousMergedNode = mergedLnode;
				startMergeNode = previousMergedNode;
			}
			if (head == null && head1 == null) {
				status = false;
			} else {
				status = true;
			}
		} while (status);

		return startMergeNode;
	}

	private static LNode storeLinkedList2() {
		LNode l1 = new LNode();
		l1.value = 4;
		LNode l2 = new LNode();
		l2.value = 5;
		LNode l3 = new LNode();
		l3.value = 7;
		LNode l4 = new LNode();
		l4.value = 9;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;

		return l1;
	}

	private static LNode storeLinkedList1() {
		LNode l1 = new LNode();
		l1.value = 1;
		LNode l2 = new LNode();
		l2.value = 2;
		LNode l3 = new LNode();
		l3.value = 3;
		LNode l4 = new LNode();
		l4.value = 4;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		return l1;
	}

}

class LNode {
	int value;
	LNode next;
}
