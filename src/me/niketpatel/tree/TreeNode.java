package me.niketpatel.tree;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted = false;
	
	public TreeNode (int data){
		this.data = data;
	}
	
	public static TreeNode addSorted(int[] data, int start, int end){
		if (end >= start){
			int mid = (start+end)/2;
			TreeNode newNode = new TreeNode(data[mid]);
			newNode.leftChild = addSorted(data, start, mid-1);
			newNode.rightChild = addSorted(data, mid+1, end);
			return newNode;
		}
		return null;
	}
	
	public TreeNode find(int data){
		if (this.data == data && !isDeleted)
			return this;
		if (data < this.data && this.leftChild != null)
			return this.leftChild.find(data);
		if (this.rightChild != null)
			return this.rightChild.find(data);
		return null;
	}
	
	public void insert(int data){
		if (data >= this.data){
			if (this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else 
				this.rightChild.insert(data);
			
		} else {
			if (this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.find(data);
		}
	}
	
	public void delete(){
		this.isDeleted = true;
	}
	
	public boolean isDeleted(){
		return this.isDeleted;
	}
	
	public int findSmallest(){
		if (this.leftChild == null){
			return this.data;
		} else {
			return this.leftChild.findSmallest();
		}
	}
	
	public int findLargest(){
		if (this.rightChild == null){
			return this.data;
		} else {
			return this.rightChild.findLargest();
		}
	}
	
	public int countLeafs(){
		if(this.leftChild == null && this.rightChild == null) return 1;
		int leftLeaves = 0;
		int rightLeaves = 0;
		if (this.leftChild != null){
			leftLeaves = leftChild.countLeafs();
		}
		
		if (this.rightChild != null){
			rightLeaves = rightChild.countLeafs();
		}
		
		return (leftLeaves + rightLeaves);
	}
	
	public int sumOfTree(){
		int left = 0;
		int right = 0;
		
		if(this.leftChild == null && this.rightChild == null) return this.getData();
		
		if (this.leftChild != null){
			left = leftChild.sumOfTree();
		}
		
		if (this.rightChild != null){
			right = rightChild.sumOfTree();
		}
		
		return (left + right);
	}
	
	public int maxDepth() {
		int left = 0;
		int right = 0;
		if (this.leftChild == null && this.rightChild == null ) return 0;
		
		if (this.leftChild != null){
			left = this.leftChild.maxDepth();
		}
		if (this.rightChild != null){
			right = this.rightChild.maxDepth();
		}
		
		return 1 + Math.max(left, right);
	}
	
	
	
	public boolean isLeaf() {
		return this.leftChild == null && this.rightChild == null;
	}
	
	
	public int findHeight(){
		int left = 0;
		int right = 0;
		if (this.leftChild == null && this.rightChild == null) return 1;
		
		if (this.leftChild != null){
			left = this.leftChild.findHeight();
		}
		if (this.rightChild != null){
			right = this.rightChild.findHeight();
		}
		
		return (left > right) ? (left + 1) : (right + 1);
	}
	
	public int findHeightInt(){
		int left = 0;
		int right = 0;
		if (this.leftChild == null && this.rightChild == null) return 1;
		
		if (this.leftChild != null){
			left = this.leftChild.findHeight();
		}
		if (this.rightChild != null){
			right = this.rightChild.findHeight();
		}
		
		return (left > right) ? (left + 1) : (right + 1);
	}
	
	public void traverseInorder(){
		if(this.leftChild != null && !this.leftChild.isDeleted)
			this.leftChild.traverseInorder();
		
		System.out.println(this + " ");
		
		if(this.rightChild != null && !this.rightChild.isDeleted)
			this.rightChild.traverseInorder();
	}
	
	
	public String toString() {
		return String.valueOf(this.data);
	}
	
	public int getData() {
		return data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	

}
