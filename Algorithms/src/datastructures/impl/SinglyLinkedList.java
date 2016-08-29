package datastructures.impl;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    
    private SinglyLinkedList() {    }
    
    private SinglyLinkedList(Node<T> node) {
	super();
	this.head = node;
	this.tail = node;
    }

    public static <T> SinglyLinkedList<T> newInstance () {
	return new SinglyLinkedList<>();
    }
    
    public static <T> SinglyLinkedList<T> newInstance (Node<T> node) {
	return new SinglyLinkedList<>(node);
    }
    
    public static <T> SinglyLinkedList<T> newInstance (T value) {
	return new SinglyLinkedList<T>(Node.newInstance(value));
    }

    public void append(Node<T> node) {
	if (head == null) {
	    this.head = node;
	} else {
	    tail.next = node;
	    this.tail = node;
	}
    }
    
    
    
    public Node<T> getHead() {
        return head;
    }


    public void setHead(Node<T> head) {
        this.head = head;
    }


    public Node<T> getTail() {
        return tail;
    }


    public void setTail(Node<T> tail) {
        this.tail = tail;
    }


    private static class Node<T> implements Comparable<T> {
	
	private T value;
	private Node<T> next;
	
	private Node (T value) {
	    super();
	    this.value = value;
	}
	
	public static <T> Node<T> newInstance (T value) {
	    return new Node<T>(value);
	}
	
	@Override
	public int compareTo(T o) {
	    if (o == this.value) {
		return 1;
	    } else {
		return 0;
	    }
	    
	}

	public T getValue() {
	    return value;
	}

	public void setValue(T value) {
	    this.value = value;
	}

	public Node<T> getNext() {
	    return next;
	}

	public void setNext(Node<T> next) {
	    this.next = next;
	}
	
    }
    
}
