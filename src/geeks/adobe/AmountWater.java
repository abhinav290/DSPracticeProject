package geeks.adobe;

import java.util.Scanner;

public class AmountWater {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,t,n,j,w=0,a[],x,maxl,maxr;
		t=s.nextInt();
		for(j=0;j<t;j++) {
			n=s.nextInt();
			a= new int[n];
			w=0;
			for(i=0;i<n;i++) {
				a[i] =s.nextInt();
			}
			for(i=1;i<n-1;i++) {
				maxl=0;
				maxr=0;
				for(int k=0;k<i;k++) {
					maxl=max(maxl,a[k]);
				}
				for(int k=i+1;k<n;k++) {
					maxr=max(maxr,a[k]);
				}
				w+=min(maxl,maxr)-a[i];
				System.out.print(i + " - " + w);
			}
			System.out.println(w);
		}
	}
	public static int max(int a1,int a2) {
		return a1>a2?a1:a2;
	}
	public static int min(int a1,int a2) {
		return a1<a2?a1:a2;
	}
}
