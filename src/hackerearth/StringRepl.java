package hackerearth;

import java.util.Scanner;

public class StringRepl {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a[],x=0,i;
		a=new int[5];
		long ans;
		int t=s.nextInt();
		while(t>0) {
			ans=1;
			for(i=0;i<a.length;i++) {
				a[i]=-1;	
			}
			String inp=s.next();
			for(i=0;i<inp.length();i++) {
				if(inp.charAt(i)=='_') {
					ans=ans*calc(a,i);
					continue;
				}
				x=index(inp.charAt(i));
				if(x!=-1 && a[x]==-1) {
					a[x]=i;
				}
			}
			System.out.println(ans);
			t--;
		}
	}
	public static int index(char c) {
		switch(c) {
		case 'a':
			return 0;
		case 'e':
			return 1;
		case 'i':
			return 2;
		case 'o':
			return 3;
		case 'u':
			return 4;
		default:
			return -1;
		}
	}
	public static int calc(int a[],int x) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1 && a[i]<x) {
				c++;
			}
		}
		return c;
	}
}
