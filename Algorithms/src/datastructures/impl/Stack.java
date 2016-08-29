package datastructures.impl;

public class Stack<E> {
    
    private Node<E> head;
    private int size = 0;
    
    public Stack() {
    }
    
    public void push (E data) {
	Node<E> node = new Node<E>(data);
	node.next = head;
	head = node;
    }
    
    public E pop () {
	E data = head.data;
	head = head.next;
	return data;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    
    class Node<E> {
	private E data;
	private Node<E> next;
	
	public Node (E data) { 
	    this.data = data;
	}

	public E getData() {
	    return data;
	}

	public void setData(E data) {
	    this.data = data;
	}

	public Node<E> getNext() {
	    return next;
	}

	public void setNext(Node<E> next) {
	    this.next = next;
	}
    }
}
