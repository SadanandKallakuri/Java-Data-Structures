package com.ds.singleLinkedLists;

public class Demo {

	public static void main(String[] args) {
		singleList list=new singleList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.deleteFirst();
		list.deleteFirst();
		list.insertLast(100);
		list.insertLast(200);
		list.insertLast(300);
		list.displayList();


	}

}
