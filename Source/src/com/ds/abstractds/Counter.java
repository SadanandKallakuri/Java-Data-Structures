package com.ds.abstractds;

public class Counter {

	String str;
	String str1;
	int count;
	int ctr;
	public Counter(String str) {
		this.str=str;
		System.out.println("Name of instance is "+str);
	}
	
	public void increment(int ctr1) {
		count=ctr1;
		count++;
		System.out.println("Current value is "+count);

		//return count;
	}
	public Counter(int ctr) {
		int ct=ctr;
		increment(ct);
	}
	public int getCurrentValue() {
		increment(count);
		return count;
	}
	
	public String toString() {
		//str1= (String) count;
		System.out.println("Current value in string "+getCurrentValue());
		return null;
	}
	
}
