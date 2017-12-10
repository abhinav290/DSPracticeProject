package trees;

public class BSTree {
	BinaryNode head;

	public BSTree() {
		this.head=null;
	}

	public BinaryNode getHead() {
		return head;
	}

	public void setHead(BinaryNode head) {
		this.head = head;
	}

	public BSTree(BinaryNode head) {
		this.head=head;
	}
	public BinaryNode generateBSTfromSortedArr(int[] a,int b,int e) {
		int m;
		if(b>e) {
			return null;
		}
		m=(e+b);
		m=m/2;
		BinaryNode head = new BinaryNode(a[m]);
		head.left=generateBSTfromSortedArr(a,b,m-1);
		head.right=generateBSTfromSortedArr(a, m+1, e);
		return head;
	}
	public void inorder(BinaryNode head) {
		if(head==null) {
			return;
		}
		if(head.left!=null)
			inorder(head.left);
		System.out.print(head.value);
		if(head.right!=null) 
			inorder(head.right);
	}
}
