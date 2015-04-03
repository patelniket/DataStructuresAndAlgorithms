package me.niketpatel.common;


public class QueueArray {
	
	int[] queueArray;
	int head = -1;
	int tail = -1;
	int maxsize = 0;
	
	QueueArray(int size){
		this.queueArray = new int[size];
		this.maxsize = size;
	}
	
	
	public void enqueue(int data){
		if (tail == maxsize - 1){
			throw new RuntimeException("Queue is full");
		}
		if (this.tail < 0){
		this.queueArray[++tail] = data;
		this.queueArray[++head] = data;
		} else {
			this.queueArray[++tail] = data;
		}
	}
	
	public int dequeue(){
		if (tail < 0){
			throw new RuntimeException("Queue is empty");
		}
		return this.queueArray[head++];
	}
	
	public int peek(){
		if(this.head < 0){
			throw new RuntimeException("Queue is empty");
		}
		return this.queueArray[head];
	}
	
	
	public boolean isEmpty(){
		return tail < 0;
	}
	
	public String toString(){
		String result = "{ ";
		for (int i=head; i<= tail; i++){
			result += queueArray[i] + ", ";
		}
		result += " }";
		return result;
	}

	public static void main(String[] args) {
		QueueArray q = new QueueArray(7);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		System.out.println(q.dequeue());
		q.enqueue(11);
		q.enqueue(11);
		q.enqueue(11);
		//q.enqueue(11);
		System.out.print(q);

	}

}
