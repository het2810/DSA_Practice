package interview_prep.Basic_LinkedList;

import java.util.*;

//Definition of ListNode
class ListNode {
	int val;
	ListNode next;

	// Constructors
	ListNode(int val1, ListNode next1) {
		val = val1;
		next = next1;
	}

	ListNode(int val1) {
		val = val1;
		next = null;
	}
}

class Solution {
	// Function to print the linked list
	void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public ListNode insertBeforeX(ListNode head, int X, int val) {
		if (head == null) {
			return null;
		}
		if (head.val == val) {
			return new ListNode(X, head);
		}
		ListNode temp = head;

		while (temp.next != null) {

//			System.out.println(temp.val);
			if (temp.next.val == val) {
				ListNode newNode = new ListNode(X);
				newNode.next = temp.next;
				temp.next = newNode;
//				System.out.println(temp.val);
				break;
			}
			temp = temp.next;
		}

		return head;

	}
}

public class InsertionBeforeX extends Solution {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(0, 1, 2, 5);
		int el = 5;
		int val = 5;

		// Create a linked list with the given list
		ListNode head = new ListNode(arr.get(0));
		head.next = new ListNode(arr.get(1));
		head.next.next = new ListNode(arr.get(2));
		head.next.next.next = new ListNode(arr.get(3));
		Solution s = new Solution();
		head = s.insertBeforeX(head, el, val);
		s.printList(head);

	}
}