package com.queue.normalqueue;

public class Demo {

	public static void main(String[] args) {
      normalQueue queue=new normalQueue(4);
      queue.insert(1);
      queue.insert(2);
      queue.insert(3);
      queue.insert(4);
      queue.insert(5);
      queue.view();
      queue.peekFront();
      queue.remove();
      queue.remove();
      queue.remove();
      queue.remove();
      queue.remove();
      queue.remove();
      queue.remove();
      queue.view();
	}

}
