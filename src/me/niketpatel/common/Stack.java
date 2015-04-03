package me.niketpatel.common;

public class Stack {

	private Node top;
	int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty()
    {
        return top == null;
    }
	
	public void push(int data){
		Node newNode = new Node(data);
		
		if (this.top == null){
			this.top = newNode;
		} else {
			newNode.setNextNode(this.top);
			this.top = newNode;
		}
		this.size++;
	}
	
	public int pop(){
		int result = 0;
		if (this.top != null){
		result = this.top.getData();
		this.top = this.top.getNextNode();
		size--;
		}
		return result;
	}
	
	public int peek(){
		return this.top.getData();
	}


	public String toString(){
		String result =  "{";
		Node current = this.top;
		
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
		
		Stack stack = new Stack();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack);


	}

}
