package me.niketpatel.tree;

public class BinarySearchTree {
	
	private TreeNode root;
	
	public void insert(int data){
		if (this.root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
	}
	
	public TreeNode find(int data){
		if (this.root != null){
			return this.root.find(data);
		}
		return null;
	}
	
	public void delete(int data){
		TreeNode todel = find(data);
		todel.delete();
	}
	
	public int findSmallest(){
		if (this.root == null){
			return this.root.getData();
		} else {
			return this.root.findSmallest();
		}
	}
	
	public int findLargest(){
		if (this.root == null){
			return this.root.getData();
		} else {
			return this.root.findLargest();
		}
	}
	
	public int findHeight(){
		if (this.root == null) return 0;
		return this.root.findHeight();
	}
	
	public int countLeafs(){
		if(this.root == null) return 0;
		return this.root.countLeafs();
	}

	public int maxDepth() {  
		   if (this.root == null) return 0;  
		   return this.root.maxDepth();  
	}
	
	public int sumOfTree(){
		if (this.root == null) return this.root.getData();
		return this.root.getData() + this.root.sumOfTree();
	}
	
//	public int maxDepthIter(TreeNode root) {
//		int left = 0;
//		int right = 0;
//		if (root.getleftChild == null && root.rightChild == null ) return 0;
//		
//		while(root.getleftChild != null){
//			root.getleftChild = root.getleftChild.leftChild;
//			left++;
//		}
//		while(root.rightChild != null){
//			root.rightChild = root.rightChild.rightChild;
//			right++;
//		}
//		
//		return 1 + Math.max(left, right);
//	}
	
	public void traverseInorder(){
		if(this.root != null){
			this.root.traverseInorder();
		}
		System.out.println();
	}
	
	public static BinarySearchTree createFromSortedArray(int[] data){
		BinarySearchTree bst = new BinarySearchTree();
		if(data !=null && data.length > 0){
			bst.root = TreeNode.addSorted(data, 0, data.length - 1);
		}
		return bst;
	}
	
	

	public static void main(String[] args) {
		int[] sample = {1, 2, 3};
		BinarySearchTree bst = BinarySearchTree.createFromSortedArray(sample);
//		for (int x : sample){
//			//System.out.print("{"+x+"}");
//			bst.insert(x);
//		}
		//System.out.print("\n");
		//System.out.println(bst.find(100));
		//System.out.println(bst.findSmallest());
        //System.out.println(bst.findLargest());
		//System.out.println(bst.countLeafs());
        //System.out.println(bst.maxDepth());
        //System.out.println(bst.findHeight());
        System.out.println(bst.sumOfTree());
        //bst.insert(2);
		bst.traverseInorder();

	}
	
	
	
//	public void delete(Integer data){
//		
//		TreeNode current = this.root;
//		TreeNode parent = this.root;
//		boolean isLeftChild = false;
//		
//		if (current == null){
//			return;
//		}
//		
//		while (current != null && current.getData() != data){
//			parent = current;
//			
//			if (data < current.getData()){
//				current = current.getLeftChild();
//				isLeftChild = true;
//			} else {
//				current = current.getRightChild();
//				isLeftChild = false;
//			}
//			
//			if (current == null){
//				return;
//			}
//			
//			//case 1 - node has no leaf nodes
//			if (current.getLeftChild() == null && current.getRightChild() == null){
//				if (current == this.root){
//					this.root = null;
//				} else {
//					if (isLeftChild){
//						parent.setLeftChild(null);
//					} else {
//						parent.setRightChild(null);
//					}
//				}
//				
//			}
//			//case 2.1 - node has only leftChild
//			else if (current.getRightChild() == null){
//				if (current == this.root){
//					this.root = current.getLeftChild();
//				} else if (isLeftChild) {
//						parent.setLeftChild(current.getLeftChild());
//				} else {
//						parent.setRightChild(current.getLeftChild());
//				}
//				
//			}
//			//case 2.2 - node has only leftChild
//			else if (current.getLeftChild() == null){
//				if (current == this.root){
//					this.root = current.getRightChild();
//				} else if (isLeftChild) {
//						parent.setLeftChild(current.getRightChild());
//				} else {
//						parent.setRightChild(current.getRightChild());
//				}
//				
//			}
	
	// This is case 3 - Most complicated (node to be deleted has 2 children)
//			else {
//				TreeNode successor = getSuccessor(current);
//				if (current == root)
//					root = successor;
//				else if (isLeftChild) {
//					parent.setLeftChild(successor);
//				} else {
//					parent.setRightChild(successor);
//				}
//				successor.setLeftChild(current.getLeftChild());
//			}
//		}
//	}
//
//	private TreeNode getSuccessor(TreeNode node) {
//		TreeNode parentOfSuccessor = node;
//		TreeNode successor = node;
//		TreeNode current = node.getRightChild();
//		while (current != null) {
//			parentOfSuccessor = successor;
//			successor = current;
//			current = current.getLeftChild();
//		}
//		if (successor != node.getRightChild()) {
//			parentOfSuccessor.setLeftChild(successor.getRightChild());
//			successor.setRightChild(node.getRightChild());
//		}
//		return successor;
//	}

	
}
