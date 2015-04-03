package me.niketpatel.common;

public class DoublyLinkedList {
	private DoublyNode head;
	
	public void insertAtHead(int data){
		DoublyNode newNode = new DoublyNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null){
		this.head.setPreviuosNode(newNode);
		}
		this.head = newNode;
	}
	
	public void insertionSorter(DoublyLinkedList list){
		DoublyNode current = this.head;
		
		while (current.getData() > current.getNextNode().getData()){
			if (current == this.head){
				
			}
		}
	}
	
	@Override
	public String toString(){
		String result = "{ ";
		DoublyNode current = this.head;
		
		while (current != null){
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += " }";
		return result;
	}

}
