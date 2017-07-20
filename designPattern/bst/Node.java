package designPattern.bst;

public class Node {

	public Node leftNode;
	public Node rightNode;
	int value;

	/**
	 * @return the leftNode
	 */
	public Node getLeftNode() {
		return leftNode;
	}

	/**
	 * @param leftNode
	 *            the leftNode to set
	 */
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	/**
	 * @return the rightNode
	 */
	public Node getRightNode() {
		return rightNode;
	}

	/**
	 * @param rightNode
	 *            the rightNode to set
	 */
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	Node(int value) {
		this.value = value;
	}

}
