package me.niketpatel.common;

public class StackArray {
	
	int top;
	int[] array;
	int maxsize;
	
	StackArray(int size){
	this.array = new int[size];
	this.top = -1;
	this.maxsize = size;
	}
	
	public void push(int data){
		if (this.top == maxsize - 1){
			throw new RuntimeException("Underlying Stack overflow");
		}
		this.array[++top] = data;
	}
	
	public int pop(){
		if (top < 0){
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}
	
	public int peek(){
		if (top < 0){
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	public boolean isEmpty(){
		return this.top < 0;
	}
	
	
	public String toString(){
		String result = "{";
		for (int i = 0; i <= top; i++){
		result += this.array[i] + ", ";
		}
		result += "}";
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		StackArray stack = new StackArray(5);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.pop();
		System.out.println(stack);
	}

}
