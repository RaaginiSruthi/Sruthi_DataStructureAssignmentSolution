package com.datastructure.bst;

//Question 1
public class Driver {

	public static void main(String[] args) {

		BST tree = new BST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;

		tree.createSkewedTree(tree.node, order);

		System.out.print("Values in the skewed tree are: ");

		tree.traverseRightSkewed(tree.headNode);
	}
}