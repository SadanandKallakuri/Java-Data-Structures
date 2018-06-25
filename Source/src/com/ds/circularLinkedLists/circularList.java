package com.ds.circularLinkedLists;

import com.ds.singleLinkedLists.Node;

public class circularList {
Node first;
Node last;

	public circularList() {
	first= null;
	last= null;
	}
	public boolean isEmpty() {
		return first== null;
	}
	
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data= data;
		if(isEmpty()){
		last=newNode;	
		}
		newNode.next=first;
		first=newNode;
	}
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data= data;
		if(isEmpty()){
		first=newNode;	
		}
		last.next=newNode;
		last=newNode;
	}
	public int deleteFirst() {
		int temp=first.data;
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return temp;
		}
	public void displayList() {
	  	   System.out.println("From FIRST----->LAST");
	  	   Node current= first;
	  	   while(current!=null) {
	  		   current.displayNode(); 
	  		   current=current.next;
	  	   }
	  	   System.out.println();
		   }
	
}
