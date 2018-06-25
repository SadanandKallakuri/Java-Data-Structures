package com.ds.doublyLinkedLists;

public class doublyLinkedLists {
Node first;
Node last;

	public doublyLinkedLists() {
		this.first=null;
		this.last=null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	//insert node at first
	public void insertFirst(int data) {
		Node newNode= new Node();
		newNode.data=data;
		if(isEmpty()) {
			last=newNode;
		}
		else{
			first.previous=newNode;
			newNode.next=first;
		}
		this.first=newNode;
	}
	//insert node at last position
	public void insertLast(int data) {
		Node newNode= new Node();
		newNode.data=data;
		if(isEmpty()) {
			first=newNode;
		}
		else{
			last.next=newNode;
			newNode.previous=last;
		}
		this.last=newNode;
	}
	//delete first node
	public Node deleteFirst() {
		Node temp=first;
		if(first.next==null) {
			last=null;
		}
		else {
			first.next.previous=null;
		}
		first=first.next;
		return temp;
	}
	//delete last node
	public Node deleteLast() {
		Node temp=last;
		if(first.next==null) {
			first=null;
		}
		else {
			last.previous.next=null;
		}
		last=last.previous;
		return temp;
	}
	//insert node after a particular node
	public boolean insertAfter(int key,int data) {
		Node current=first;
		while(current.data!=key) {
			current=current.next;
			if(current==null) {
				return false;
			}
		}
		
		Node newNode=new Node();
		newNode.data=data;
		if(current==last) {
			current.next=null;
			last=newNode;
		}
		else {
			newNode.next=current.next;
			current.next.previous=newNode;
		}
		current.next=newNode;
		newNode.previous=current;
		return true;
	}
	//delete a particular node
	public Node deleteKey(int key) {
		Node current=first;
		while(current.data!=key) {
			current=current.next;
			if(current==null) {
				return null;
			}
		}
		
		Node temp=current;
		if(current == last) {
			current.previous.next=null;
			last=current.previous;
		}
		else if(current==first) {
			current.next.previous=null;
			first=current.next;
		}
		else {
			current.previous.next=current.next;
			current.next.previous=current.previous;
		}
		return temp;
	}
	//display from first
	public void displayFirst() {
	  	   System.out.print("From FIRST----->LAST");
	  	   Node current= first;
	  	   while(current!=null) {
	  		   current.displayNode(); 
	  		   current=current.next;
	  	   }
	  	   System.out.println();
		   }
	//display from last
	public void displayLast() {
	  	   System.out.print("From LAST----->FIRST");
	  	   Node current= last;
	  	   while(current!=null) {
	  		   current.displayNode(); 
	  		   current=current.previous;
	  	   }
	  	   System.out.println();
		   }
	
}
