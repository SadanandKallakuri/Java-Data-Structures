package com.ds.singleLinkedLists;

public class singleList {
Node first;
Node last;

     public singleList() {
    	 
     }
     
     
     public void insertFirst(int data) {
    	 Node newNode= new Node();
  	   newNode.data = data;
  	   newNode.next=first;
	   first=newNode;
	   last= first;
	   while(last.next!=null) {
  		   last=last.next;
  	   }
     }
     
     public Node deleteFirst() {
  	   Node temp=first;
  	   first=first.next;
  	 last= first;
  	 while(last.next!=null) {
		   last=last.next;
	   }
  	   return temp;
     }
     
     public void displayList() {
  	   System.out.println("From FIRST----->LAST");
  	   Node current= first;
  	   while(current!=null) {
  		   current.displayNode(); 
  		   current=current.next;
  	   }
  	 last= first;
  	 while(last.next!=null) {
		   last=last.next;
	   }
      }
     /* inefficient way to insert node at last.
     public void insertLast(int data) {
  	   Node last=first;
  	   while(last.next!=null) {
  		   last=last.next;
  	   }
		   Node newNode= new Node();
		   newNode.data=data;
		   last.next=newNode;
	   }
	   */
     public void insertLast(int data) {
		   //System.out.println("Before Inserting");
    	   //displayList();
  		   Node newNode= new Node();
  		   newNode.data=data;
  		   last.next=newNode;
  		   //System.out.println("After Inserting");
  		   displayList();
  	   }
}
