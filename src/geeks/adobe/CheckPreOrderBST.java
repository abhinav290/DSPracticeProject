package geeks.adobe;

import java.util.Stack;

public class CheckPreOrderBST {
	public static void main(String[] args) {
		int[] pre2 = new int[]{40, 40,40};
		int n1 = pre2.length;
		System.out.println(canRepresentBST(pre2, n1));

	}
	public static boolean canRepresentBST(int[] pre,int n) {
		int root=Integer.MIN_VALUE;
		Stack<Integer> stack= new Stack<>();
		for(int i=0;i<n;i++) {
			if(pre[i]<root) {
				return false;
			}
			while(!stack.isEmpty() && pre[i] > stack.peek()) {
				root=stack.pop();
			}
			stack.push(pre[i]);
		}
		return true;
	}
}
