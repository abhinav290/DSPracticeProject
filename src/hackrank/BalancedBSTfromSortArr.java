package hackrank;

import trees.BSTree;

public class BalancedBSTfromSortArr {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		BSTree tree= new BSTree();
		tree.setHead(tree.generateBSTfromSortedArr(a, 0, a.length-1));
		tree.inorder(tree.getHead());
		System.out.println(calculateLevel(a, 0, a.length-1, 9));
	}
	public static int calculateLevel(int a[],int b,int e,int v) {
		if(b>e) 
			return 0;
			
		int	r,m=(b+e)/2;
		
		if(v==a[m]) {
			return 1;
		}
		
		if(v<a[m]) 
			r=calculateLevel(a, b, m-1, v); 
		else
			r=calculateLevel(a, m+1, e, v);
		
		if(r>0) 
			return r+1;
		
		return r;
	}
}
