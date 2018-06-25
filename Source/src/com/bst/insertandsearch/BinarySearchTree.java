package com.bst.insertandsearch;


public class BinarySearchTree{
Node root;
public void addNode(int key,String name){
Node newNode=new Node(key,name);
if(root==null){
root=newNode;
}else{
Node focusnode;
focusnode=root;
Node parent;
while(true){
parent=focusnode;
if(key< focusnode.key){
focusnode=focusnode.leftChild;
if(focusnode==null){
parent.leftChild=newNode;
System.out.println(name+" has the key "+key);
return;
}
				}
				else{
focusnode=focusnode.rightChild;
if(focusnode==null){
parent.rightChild=newNode;
System.out.println(name+" has the key "+key);
return;
}
			}
		}
	}
}
public static void main(String args[]){
BinarySearchTree bst=new BinarySearchTree();
bst.addNode(4,"Batman");
bst.addNode(2,"Arrow");
bst.addNode(1,"Flash");
bst.addNode(3,"Speedy");
bst.addNode(6,"Superman");
bst.addNode(5,"Supergirl");
bst.addNode(7,"Cap Marvel");


} 
}

					




 

