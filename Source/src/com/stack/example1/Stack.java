package com.stack.example1;

public class Stack {
    int size;
    long[] numbersArray;
    int top;
    
    public Stack(int j){
    this.size=j;
    this.numbersArray= new long[size];
    this.top=-1;
    }
    
    public void push(int k) {
    	boolean ful1=isFull();
    	if(ful1==false) {
    	top++;
    	numbersArray[top]=k;
    	System.out.println("The current top element of stack after the push is "+k);}
    	else {
    		System.out.println("Stack is full");
    	}
    }
    
    public void pop() {
    	boolean emp1=isEmpty();
    	if(emp1==false) {
    	int otop=top;
    	top--;
    	System.out.println("The current popped element is "+numbersArray[otop]);}
    	else {
    	System.out.println("Stack is empty");}
    }
    
    public void peak() {
    	System.out.println("The current peak of stack is "+numbersArray[top]);
    }
    
    public boolean isEmpty() {
    	return (top==-1);
    }
    
    public boolean isFull() {
    	return (top==size-1);
    }
 }
