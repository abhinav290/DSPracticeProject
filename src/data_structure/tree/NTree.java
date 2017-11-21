package src.data_structure.tree;

import java.util.*;

public class  NTree<T> {
	Map<T,List<Integer>> map = new HashMap<>();
	NTree() {
		//this .root = new Node(val);
	}
	public void construct(T [] arr) {

		for (int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],new ArrayList<>());
				map.get(arr[i]).add(i);
				continue;
			}
			map.get(arr[i]).add(i);			
		}
		map.forEach((k,v)->System.out.println(k+ " - "+ v));
	}
	public void printLevel() {
		Queue<Integer> q =new LinkedList<>();
		final int separator =-5;
		q.add(-1);
		q.add(separator);
		while(!q.isEmpty()) {
			int head=q.poll();
			if(head!=separator) {
				System.out.print(head + " ");
				if(map.containsKey(head)) {
					q.addAll(map.get(head));
				}
			}else if(head == separator && !q.isEmpty()) {
				System.out.println();
				q.add(separator);
			}
		}
	}
	public void printLtoR() {
		Stack<Integer> q =new Stack<>();
		final int separator =-5;
		q.add(-1);
		while(!q.isEmpty()) {
			int head=q.pop();
			System.out.print(head + " ");
			if(map.containsKey(head)) {
				Collections.reverse(map.get(head));
				q.addAll(map.get(head));
			}
		}
	}
	public static void main(String[] args) {
		NTree<Integer> tree= new NTree<>();
		Integer a[] ={4,3,-1,-1,1,2,7,3,1,4,2,1};
		tree.construct(a);
		tree.printLevel();
		System.out.println();
		tree.printLtoR();
	}

}
class Node<T> {
	T data;
	List<Node<T>> child;
	Node(T data) {
		this.data=data;
		this.child = new ArrayList<>();
	}
	public T getData() {
		return this.data;
	}
	public List<Node<T>> getChild() {
		return this.child;
	}
	public void addChild(T val) {
		this.child.add(new Node<T>(val));
	}
	public void removeChild(T val) {
		this.child.remove(val);
	}
	public void removeChild(int val) {
		this.child.remove(val);
	}
	public void removeChild(String val) {
		System.out.println(val + " is getting removed from String method");
	}
	public int  getChildCount() {
		return this.child.size();
	}
	public boolean hasChild(T val) {
		return this.child.contains(val);
	}


}