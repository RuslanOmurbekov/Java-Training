package com.java;

public class CircularDoublyLinkedList {
	public static void main(String[] args) {
		
		CircularDoublyLinkedList c = new CircularDoublyLinkedList();
		Node n1 = new Node("one");
		Node n2 = new Node("two");
		Node n3 = new Node("three");
		Node n4 = new Node("four");
		Node n5 = new Node("five");
		Node n6 = new Node("six");
		Node n7 = new Node("seven");
		Node n8 = new Node("eight");
		Node n9 = new Node("nine");
		Node n10 = new Node("ten");
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n10);
		n10.setNext(n1);
		
		n1.setPrevious(n10);
		n2.setPrevious(n1);
		n3.setPrevious(n2);
		n4.setPrevious(n3);
		n5.setPrevious(n4);
		n6.setPrevious(n5);
		n7.setPrevious(n6);
		n8.setPrevious(n7);
		n9.setPrevious(n8);
		n10.setPrevious(n9);
		
		
		System.out.println(c.shortestPathFromStartToTarget(n10, n1));
		
	}
	
	public String shortestPathFromStartToTarget(Node start, Node target) {
		
		Node nextCurrent = start;
		String nextPath = nextCurrent.getValue();
		nextCurrent = nextCurrent.getNext();
		
		
		
		while(nextCurrent != target) {
			nextPath = nextPath + " - " + nextCurrent.getValue();
			nextCurrent = nextCurrent.getNext();
		}
		nextPath = nextPath + " - " + target.getValue();
		
		System.out.println(nextPath);
		
		Node prevCurrent = start;
		String prevPath=prevCurrent.getValue();
		prevCurrent=prevCurrent.getPrevious();
		while(prevCurrent != target) {
			prevPath=prevPath + " - " + prevCurrent.getValue();
			prevCurrent=prevCurrent.getPrevious();
		}
		
		prevPath =prevPath + " - " + target.getValue();
		System.out.println(prevPath + "\n");
		
		if(nextPath.length() < prevPath.length()) {
			return nextPath;
		}else {
			return prevPath;
		}
	}

	static class Node {
		private String value;
		private Node next;
		private Node previous;

		public Node(String value) {
			this.value = value;
		}

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
		
		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}
	}
}
