package me.niketpatel.common;

import java.util.NoSuchElementException;

public class Queue {
	
	private Node head;
	private Node tail;
	int size = 0;
	
	
	public void enqueue(int data){
		Node newNode = new Node(data);
		if (this.tail == null){
			this.tail = newNode;
			this.head = newNode;
		} else {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
		this.size++;
	}
	
	public int dequeue(){
		if (isEmpty()) {
            throw new NoSuchElementException();
        }
		int result = 0;
		if (this.head != null){
			result = this.head.getData();
			this.head = this.head.getNextNode();
		}
		this.size--;
		return result;
	}
	
	public int peek(){
		if (isEmpty()) {
            throw new NoSuchElementException();
        }
		return this.head.getData();
	}
		
	
	public boolean isEmpty() {
        return head == null;
    }
	
	public String toString(){
		String result =  "{";
		Node current = this.head;
		
		while (current != null){
			result += current.getData() + ", ";
			current = current.getNextNode();
		}
		
		result += "}";
		return result;
	}
		
	private class Node {
		
		private int data;
		private Node nextNode;
		
		public int getData() {
			return data;
		}


		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		public Node(int data){
			this.data = data;
		}
	}
	
	

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(9);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(8);
		
		queue.dequeue();
		System.out.println(queue.peek());


	}

}
