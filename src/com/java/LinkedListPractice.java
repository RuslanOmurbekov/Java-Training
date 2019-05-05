package com.java;


public class LinkedListPractice {
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setValue("1");
		
		Node n2 = new Node();
		n2.setValue("1");
		n2.setNext(n1);
		
		Node n3 = new Node();
		n3.setValue("1");
		n3.setNext(n2);
		
		Node n4 = new Node();
		n4.setValue("1");
		n4.setNext(n3);
		
		Node n5 = new Node();
		n5.setValue("1");
		n5.setNext(n4);
		
//		Node n6 = new Node();
//		n6.setValue("Woo");
//		n6.setNext(n5);
		
		//n1.setNext(n6);
		
		Node current = n5;
		
		//traverseCollectionFiveTimes(current);
		sumAllNodes(current);
	}

	private static void sumAllNodes(Node current) {
		int sum=0;
		while(current!=null) {
			System.out.println(current.getValue());
			
			sum += Integer.parseInt(current.getValue());
			
			current=current.getNext();
		}
		
		System.out.println(sum);
	}

	private static void traverseCollectionFiveTimes(Node current) {
		int loopCount = 0;
		int stepCount = 0;
		String home = current.getValue();
		
		while(current != null&&loopCount<=10) {
			System.out.println(current.getValue() + " " + loopCount + " " + stepCount);
			current = current.getNext();
			if(madeItBackHome(current, home)) {
				loopCount++;
			}
			stepCount++;
		}
	}

	private static boolean madeItBackHome(Node current, String home) {
		return current.getValue().equals(home);
	}
	
	static class Node {
		private String value;
		private Node next;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
