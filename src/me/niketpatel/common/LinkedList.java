package me.niketpatel.common;

public class LinkedList {
	Node head;
	
	public void insertAtHead(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
		
	}
	
	public void deleteFromHead(){
		this.head = this.head.getNextNode();
	}
	
	
	public void insertAfter(int data, int key){
		Node foundNode = this.find(key);
		if (foundNode == null){
			return;
		}
		if (foundNode != null){
			Node newNode = new Node(data);
			newNode.setNextNode(foundNode.getNextNode());
			foundNode.setNextNode(newNode);
		}
	}
	
	public void insertAfterIn(int data, int key){
		Node current = this.head;
		if (this.head == null) return;
		
		while (current != null){
			if (current.getData() == key){
				Node newNode = new Node(data);
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
			}
			current = current.getNextNode();
		}
	}
	
	public void insertBefore(int insertData, int key){
		if (this.head == null){
			return;
		}
		Node current = this.head;
		Node prev = current;
		if (current.getData() == key){
			Node newNode = new Node(insertData);
			newNode.setNextNode(current);
			this.head = newNode;
			return;
		}
		
		while (current != null && current.getData() != key){
			prev = current;
			current = current.getNextNode();
		}
		if (current != null){
			Node newNode = new Node(insertData);
			newNode.setNextNode(current);
			prev.setNextNode(newNode);
		}
	}
	
	
	public void insertSorted (int insertData){
		Node current = this.head;
		
		if (current == null){
			this.head = new Node (insertData);
		}
		
		while (current.getNextNode().getData() < insertData){
			current = current.getNextNode();
		}
		
		if (current.getNextNode().getData() > insertData) {
			Node newNode = new Node(insertData);
			newNode.setNextNode(current.getNextNode());
			current.setNextNode(newNode);
		}
	}
	
	
	
	public void reverse(){
		Node prev = null;
		Node current = this.head;
		Node next;
		
		if (current == null || current.getNextNode() == null){
			return;
		}
		
		while (current != null){
			next = current.getNextNode();
			current.setNextNode(prev);
			prev = current;
			current = next;
		}
		this.head = prev;
	}
	
	public void recursiveReverse(Node current){
		
		if (current == null) return;
		
		if(current.getNextNode() == null){
			this.head = current;
			return;
		}
		
		recursiveReverse(current.getNextNode());
		current.getNextNode().setNextNode(current);
		current.setNextNode(null);
	}
	
	
	public void delete(int data){
		Node current = this.head;
		Node prev = current;
		
		if (current == null) return;
		
		if (this.head.getData() == data){
			this.head = this.head.getNextNode();
		}
		
		while (current != null){
			if (current.getData() == data){
				prev.setNextNode(current.getNextNode());
			}
			prev = current;
			current = current.getNextNode();
		}
	}

	
	
	public void deleteAfter(int key){
		
		Node current = this.head;
		if (current == null || current.getNextNode() == null){
			return;
		}
		while (current != null){
			if(current.getData() == key && current.getNextNode() != null){
			current.setNextNode(current.getNextNode().getNextNode());
			}
			
			current = current.getNextNode();
		}
	}
	
	
	public void deleteBefore(int data){
		Node current = this.head;
		Node prev1 = current;
		Node prev2 = null;
		
		if (current == null || this.head.getData() == data) return;
		
		if (current.getNextNode().getData() == data) {
			this.head = current.getNextNode();
		}
		
		while (current != null){
			if (current.getData() == data){
				prev2.setNextNode(prev1.getNextNode());
			}
			prev2 = prev1;
			prev1 = current;
			current = current.getNextNode();
		}
	}
	
	
	public Node find (int data){
		Node current = this.head;
		while(current != null){
			if(current.getData() == data){
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	

	public int length(){
		int length = 0;
		Node current = this.head;
		
		while (current != null){
			length++;
			current = current.getNextNode();
		}
		return length;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public String toString(){
		String result =  "{";
		Node current = this.head;
		
		while (current != null){
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		return result;
		
	}

}
