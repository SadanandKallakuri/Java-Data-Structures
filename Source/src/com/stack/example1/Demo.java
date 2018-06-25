package com.stack.example1;

public class Demo {

	public static void main(String[] args) {

		Stack newStack= new Stack(4);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.peak();
		newStack.push(4);
		newStack.peak();
		newStack.push(5);
		newStack.push(6);
		newStack.push(7);
		boolean ful= newStack.isFull();
        if(ful==true){
        System.out.println("Stack is Full");}
        else{
        System.out.println("Stack is not Full");}
        
        newStack.pop();
        newStack.pop();
		newStack.peak();
		newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        boolean emp= newStack.isEmpty();
        if(emp==true){
        System.out.println("Stack is Empty");}
        else{
        System.out.println("Stack is not empty");}
        
	}

}
