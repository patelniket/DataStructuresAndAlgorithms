package me.niketpatel.common;

public class DoublyListDemo {

	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		
		dList.insertAtHead(20);
		dList.insertAtHead(18);
		dList.insertAtHead(12);
		dList.insertAtHead(7);
		dList.insertAtHead(5);
		
		System.out.println(dList);

	}

}
