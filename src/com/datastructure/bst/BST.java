package com.datastructure.bst;

class Node {

	int value;
	Node left, right;

	Node(int item) {
		value = item;
		left = right = null;
	}
}

class BST {

	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	/**
	 * Create the Skewed Tree
	 * 
	 * @param root
	 * @param order
	 */
	public void createSkewedTree(Node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			createSkewedTree(root.right, order);
		} else {
			createSkewedTree(root.left, order);
		}

		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			createSkewedTree(leftNode, order);
		} else {
			createSkewedTree(rightNode, order);
		}
	}

	/**
	 * Traverse the Right Skewed Tree
	 * 
	 * @param root
	 */
	public void traverseRightSkewed(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.value + " ");
		traverseRightSkewed(root.right);
	}
}
