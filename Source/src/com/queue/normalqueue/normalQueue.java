package com.queue.normalqueue;

public class normalQueue {
	int size;
	long[] queueElements;
	int rear;
	int front;
	int items;
	
	public normalQueue(int j) {
		this.size=j;
		this.queueElements=new long[size];
		front=0;
		rear=-1;
		items=0;
	}
	
	public void insert(int k) {
		boolean full=isFull();
		if(full==false) {
		rear++;
		queueElements[rear]=k;
		items++;
		System.out.println("Added Element is "+k);
		}
		else {
			System.out.println("Queue is Full");
		}
	}
	public void remove() {
		boolean emp=isEmpty();
		if(emp==false) {
		long removed=queueElements[front];
		front++;
		if(front==size) {
			front=0;
		}
		items--;
		System.out.println("Removed element is "+removed);
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	
	public void peekFront() {
		System.out.println("Front element is "+queueElements[front]);
	}
	
	public void view() {
		System.out.print("[");
		for(int k=0;k<queueElements.length;k++) {
			System.out.print(queueElements[k]+" ");
		}
		System.out.println("]");
	}
	public boolean isEmpty() {
		return (items==0);
	}
	public boolean isFull() {
		return (items==size);
	}

}
