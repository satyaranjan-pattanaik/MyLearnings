package designPattern.bst;

public class BSTSearchTest {

	public static void main(String[] args) {

		
		
		
		BSTSeachExample bst = new BSTSeachExample();
		    bst .insert(40);
		    bst    .insert(25);
		    bst    .insert(78);
		    bst    .insert(10);
		    bst   .insert(3);
		    bst  .insert(17);
		    bst  .insert(32);
		    bst  .insert(30);
		    bst  .insert(38);
		    bst   .insert(78);
		    bst   .insert(50);
		    bst   .insert(93);
		    System.out.println("Inorder traversal");
		    bst.inOrderTraversal(bst.root);
		    System.out.println("PreOrder traversal");
		    bst.preOrderTraversal(bst.root);
		    System.out.println("PostOrder traversal");
		    bst.postOrderTraversal(bst.root);

		
	}

}
