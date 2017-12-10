package hackrank;

import java.util.Arrays;
import java.util.Scanner;

public class DadSon {
	public static void main(String[] args) {
		int t,n,i,j,k,d,a[];
		Scanner s= new Scanner(System.in);
		t=s.nextInt();
		for(j=0;j<t;j++) {
			n=s.nextInt();
			k=s.nextInt();
			a=new int[n];
			d=0;
			for(i=0;i<n;i++) {
				a[i]=s.nextInt();
			}
			Arrays.sort(a);
			if(k<=n-k) {
				k=n-k;
			}
			for(i=n-1;i>=n-k;i--) {
				d+=a[i];
			}
			//           System.out.println(d +" ,dad items =  " +k );

			for(i=n-k-1;i>=0;i--) {
				d-=a[i];
			}
			System.out.println(d);
		}
	}
}