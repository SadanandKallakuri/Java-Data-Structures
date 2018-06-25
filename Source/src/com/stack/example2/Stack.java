package com.stack.example2;

public class Stack {
	int size;
    char[] charsArray;
    int top;
    
    public Stack(int j){
    this.size=j;
    this.charsArray= new char[size];
    this.top=-1;
    }
    
    public void push(char k) {
    	boolean ful1=isFull();
    	if(ful1==false) {
    	top++;
    	charsArray[top]=k;}
    	//System.out.println("The current top element of stack after the push is "+k);}
    	else {
    		System.out.println("Stack is full");
    	}
    }
    
    public char pop() {
    	boolean emp1=isEmpty();
    	if(emp1==false) {
    	int otop=top;
    	top--;
    	//System.out.println("The current popped element is "+charsArray[otop]);
    	return charsArray[otop];}
    	else {
    	System.out.println("Stack is empty");
    	return '0';}
    }
    
    public void peak() {
    	System.out.println("The current peak of stack is "+charsArray[top]);
    }
    
    public boolean isEmpty() {
    	return (top==-1);
    }
    
    public boolean isFull() {
    	return (top==size-1);
    }
}
