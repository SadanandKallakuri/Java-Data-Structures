package com.linkedlists.ex1;

public class Demo {

	public static void main(String[] args) {
      Node nodeA=new Node();
      nodeA.data=3;
      Node nodeB=new Node();
      nodeB.data=6;
      Node nodeC=new Node();
      nodeC.data=7;
      Node nodeD=new Node();
      nodeD.data=8;
      Node nodeE=new Node();
      nodeE.data=9;
      nodeA.next=nodeB;
      nodeB.next=nodeC;
      nodeC.next=nodeD;
      nodeD.next=nodeE;
      
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
		System.out.println(listLength(nodeE));
		
	}
public static int listLength(Node aNode) {
	int length=0;
	while(aNode.next!=null) {
		length++;
		aNode=aNode.next;
	}
	return length;
}
}
