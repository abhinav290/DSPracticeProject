package hackerearth;

import java.util.Scanner;

public class CommonFactorCount {

	public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
		long a,b,res=1;
		a=s.nextLong();
		b=s.nextLong();
		long h= hcf(a,b);
		if(h!=1) {
			res++;
		}
		for(int i=2;i<=h/2;i++) {
			//    System.out.println(i +" " +h%i);
			if((h%i)==0) {
				res++;
			}
		}
		System.out.println(res);
	}
	public static long hcf(long a,long b) {
		if(a==b) {
			return a;
		}
		if(a>b) {
			return hcf(a-b,b);
		}
		return hcf(a,b-a);
	}
}
