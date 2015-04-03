package me.niketpatel.common;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		//linkedList.insertAtHead(20);
		//linkedList.insertAtHead(12);
		linkedList.insertAtHead(6);
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(4);
		linkedList.insertAtHead(3);
		linkedList.insertAtHead(2);
		linkedList.insertAtHead(1);
		//linkedList.insertAtHead(5);
		//linkedList.insertAtHead(4);	
		
		
//		linkedList.insertAtHead(5);
//		linkedList.insertAtHead(10);
//		linkedList.insertAtHead(2);
//		linkedList.insertAtHead(12);
//		linkedList.insertAtHead(19);
//		linkedList.insertAtHead(20);
		
		//linkedList.delete(10);
		//linkedList.deleteFromHead();
		//linkedList.insertAfterIn(7,6);
		//linkedList.deleteAfter(3);
		//linkedList.deleteBefore(2);
		linkedList.insertBefore(7, 6);
		//linkedList.recursiveReverse(linkedList.head);
		System.out.println(linkedList);
		
		System.out.println("Length: " + linkedList.length());
		//System.out.println("Found: " + linkedList.find(12));
		

	}

}
