package hackerearth.december;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,k,a[],i,j,max,x,y;
		n=s.nextInt();
		k=s.nextInt();
		String inp=s.next();
		a=new int[inp.length()];
		for(i=0;i<inp.length();i++) {
			a[i]=inp.charAt(i)=='1'?1:0;
		}
		max=len(a);
		for(i=0;i<k;i++) {
			x=s.nextInt();
			if(x==1) {
				System.out.println(max);  		
			}
			else {
				y=s.nextInt();
				if(a[y-1]==0) {
					a[y-1]=1;
					max=find(a,y-1,max);
				}
			}
		}

	}
	public static int len(int a[]) {
		int i,t=0,max=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==1) {
				t++;
				continue;
			}
			if(max<t) {
				max=t;
			}
			t=0;
		}
		return max;
	}
	public static int find(int a[],int x,int max) {
		int i,t=1;
		i=x;
		i--;
		while(i>=0 && a[i]==1) {
			t++;
			i--;
		}
		i=x;
		i++;
		while(i<a.length && a[i]==1) {
			i++;
			t++;
		}
		return t>max?t:max;
	}
}