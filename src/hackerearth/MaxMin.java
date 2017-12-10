package hackerearth;

import java.util.Scanner;

public class MaxMin {
	public static void main(String args[] ) throws Exception {
		long a[];
		int max[],min[],n,i,j,m,m1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new long[n];
		max=new int[n];
		min= new int[n];
		for(i=0;i<n;i++) {
			a[i]=s.nextLong();
		}
		for(i=0;i<n;i++) {
			max[i]=-1;
			min[i]=-1;
			m=0;m1=0;
			for(j=i+1;j<n;j++) {
				if(m==0 && a[j]>a[i]) {
					max[i]=j;
					m=1;
				}
				if(m1==0 && a[j]<a[i]) {
					min[i]=j;
					m1=1;
				}
				if(m==1 && m1==1){
					break;
				}
			}
		}
		for(i=0;i<n;i++) {
			m=max[i];
			if(m!=-1 &&min[m]!=-1) {
				System.out.print(a[min[m]] + " ");
			} else {
				System.out.print("-1 ");
			}
		}
	}
}