package designPattern.bst;

public class BSTSeachExample {
	Node root;

	public void insert(int value){
		Node newNode  = new Node(value);
		insertNodeToBST(newNode);
	}
	
	public void insertNodeToBST(Node tempnode) {
		if (root == null) {
			this.root = tempnode;
			return;
		}
		insertRecordInToBST(root, tempnode);
	}

	// insert into BST ..
	private void insertRecordInToBST(Node root, Node tempnode) {

		if (root.value > tempnode.value) {
			if (root.getLeftNode() == null) {
				root.setLeftNode(tempnode);
				return;
			}
			insertRecordInToBST(root.getLeftNode(), tempnode);

		}
		else {
			if (root.getRightNode() == null) {
				root.setRightNode(tempnode);
				return;
			}
			insertRecordInToBST(root.getRightNode(), tempnode);

		}

	}

	public void inOrderTraversal(Node root) {
		printinOrderTraversal(root);
		System.out.println(" ");
	}

	private void printinOrderTraversal(Node tempRootNode) {

		if (tempRootNode == null) {
			return;
		}

		printinOrderTraversal(tempRootNode.getLeftNode());
		System.out.println(tempRootNode.value + " ");
		printinOrderTraversal(tempRootNode.getRightNode());
	}

	public void preOrderTraversal(Node root) {
		printPreOrderTraversal(root);
		System.out.println(" ");
	}

	private void printPreOrderTraversal(Node tempRootNode) {

		if (tempRootNode == null) {
			return;
		}

		System.out.println(tempRootNode.value + " ");
		printPreOrderTraversal(tempRootNode.getLeftNode());
		printPreOrderTraversal(tempRootNode.getRightNode());
	}

	public void postOrderTraversal(Node root) {
		printPostOrderTraversal(root);
		System.out.println(" ");
	}

	private void printPostOrderTraversal(Node tempRootNode) {

		if (tempRootNode == null) {
			return;
		}
		printPostOrderTraversal(tempRootNode.getLeftNode());
		printPostOrderTraversal(tempRootNode.getRightNode());
		System.out.println(tempRootNode.value + " ");
	}
	
	
	
	
	public static Node deleteNode(Node root, int value) {
		if (root == null)
			return null;
		if (root.value > value) {
			root.leftNode = deleteNode(root.leftNode, value);
		}
		else if (root.value < value) {
			root.rightNode = deleteNode(root.rightNode, value);

		}
		else {
			// if nodeToBeDeleted have both children
			if (root.leftNode != null && root.rightNode != null) {
				Node temp = root;
				// Finding minimum element from right
				Node minNodeForRight = minimumElement(temp.rightNode);
				// Replacing current node with minimum node from right subtree
				root.value = minNodeForRight.value;
				// Deleting minimum node from right now
				deleteNode(root.rightNode, minNodeForRight.value);

			}
			// if nodeToBeDeleted has only leftNode child
			else if (root.leftNode != null) {
				root = root.leftNode;
			}
			// if nodeToBeDeleted has only right child
			else if (root.rightNode != null) {
				root = root.rightNode;
			}
			// if nodeToBeDeleted do not have child (Leaf node)
			else
				root = null;
		}
		return root;
	}
	// Get minimum element in binary search tree
	 public static Node minimumElement(Node root) {
	 if (root.leftNode == null)
	 return root;
	 else {
	 return minimumElement(root.leftNode);
	 }
	 }

}
