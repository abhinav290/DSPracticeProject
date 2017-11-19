import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PracticeTree {
	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		int i,t,n,x1,x2,a[],j;
		t=s.nextInt();

		for(i=0;i<t;i++)
		{
			n=s.nextInt();
			a=new int[n];
			for(j=0;j<n;j++) {
				a[j]=s.nextInt();
			}
			x1 = s.nextInt();
			x2 =s.nextInt();
			System.out.println(findLCA(a,x1,x2));
		}
	}
	public static int findLCA(int []a,int n1, int n2) {
		int i;
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		path(a,n1,p1);
		path(a,n2,p2);
		for(int x:p1) {
			System.out.print(x + ",");
		}

		System.out.println();
		for(int x:p2) {
			System.out.print(x + ",");
		}
		System.out.println();

		for (i = 0; i <p1.size() && i < p2.size(); i++) {
			if (!p1.get(i).equals(p2.get(i)))
				break;
		}
		return p1.get(i-1);
	}
	public static boolean path(int [] a,int n, List<Integer> p) {
		p.clear();
		int i=n;
		while(i!=-1) {
			p.add(i);
			i=a[i];
		}
		p.add(-1);
		Collections.reverse(p);
		return true;
	}
}


/*

1
13
4 3 -1 -1 1 2 7 3 1 4 2 1 2
9 11

*/