/*@Purpose : Ability to find frequency of words in a large paragraph phrase “Paranoids are not
 * paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations”
 * - Use hashcode to find index of the words in the para
 * - Create LinkedList for each index and store the words and its frequency
 * - Use LinkedList to do the Hash Table Operation
 * - To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode
 * @File : Data Structure Using Hash Table
 * @Author : Kishlay Kishan
 */

package com.bridgelabz.dsagenerics;

public class Node<K, V> {

	K key;
	V value;
	Node<K, V> next;

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	// get method
	public K getKey() {
		return key;
	}

	// set method
	public void setKey(K key) {
		this.key = key;
	}

	// get method
	public V getValue() {
		return this.value;
	}

	// set method
	public void setValue(V value) {
		this.value = value;
	}

	// get method
	public Node<K, V> getNext() {
		return next;
	}

	// set method
	public void setNext(Node<K, V> next) {
		this.next = (Node<K, V>) next;
	}

	// toString method for to return a string representation of an object.
	@Override
	public String toString() {
		// StringBuilder class can boost performance when concatenating many strings
		// together in a loop
		StringBuilder nodeString = new StringBuilder();
		nodeString.append(" \n Node{" + "K=").append(key).append(" V=").append(value).append("}");
		if (next != null)
			nodeString.append("->").append(next);
		return nodeString.toString();
	}
}
