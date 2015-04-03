package me.niketpatel.common;

public class DoublyNode {
	private int data;
	private DoublyNode nextNode;
	private DoublyNode previuosNode;
	
	public DoublyNode (int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}
	public DoublyNode getPreviuosNode() {
		return previuosNode;
	}
	public void setPreviuosNode(DoublyNode previuosNode) {
		this.previuosNode = previuosNode;
	}
	
	@Override
	public String toString(){
		return "Data: " +this.data;
	}

}
