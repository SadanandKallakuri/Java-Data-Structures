package com.ds.doublyLinkedLists;

public class Demo {

	public static void main(String[] args) {
           doublyLinkedLists list=new doublyLinkedLists();
           list.insertFirst(1);
           list.insertFirst(2);
           list.insertFirst(3);
           list.insertFirst(4);
           list.insertFirst(5);
           list.insertFirst(6);
           list.displayFirst();
           list.displayLast();
           list.insertLast(90);
           list.insertLast(91);
           list.insertLast(92);
           list.insertLast(93);
           list.insertLast(94);
           list.displayFirst();
           list.displayLast();
           list.deleteFirst();
           list.deleteFirst();
           list.deleteFirst();
           list.displayFirst();
           list.displayLast();
           list.deleteLast();
           list.deleteLast();
           list.displayFirst();
           list.displayLast();
           list.insertAfter(2, 11);
           list.insertAfter(4, 12);
           list.insertAfter(11, 13);
           list.insertAfter(91, 14);
           list.displayFirst();
           list.deleteKey(81);
           list.deleteKey(3);
           list.deleteKey(5);
           list.deleteKey(14);
           list.displayFirst();
}

}
