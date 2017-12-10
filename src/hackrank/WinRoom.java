package hackrank;

import java.util.Arrays;
import java.util.Scanner;

public class WinRoom {

	public static void main(String[] args) {
		int t,n,x,v,i,j,rem=-1,r,threats,a[];
		Scanner s= new Scanner(System.in);
		t=s.nextInt();
		for(j=0;j<t;j++) {
			n=s.nextInt();
			r=s.nextInt();
			a=new int[n];
			threats=0;
			a[0]=s.nextInt();
			v=a[0];
			for(i=1;i<n;i++) {
				a[i]=s.nextInt();
				}
			Arrays.sort(a);
			for(i=0;i<n;i++) {
				if(a[i]==v) {
					rem=i%r;
					break;
				}
			}
			for(i=0;i<n;i++) {
				if(i%r==rem && a[i]>v) {
					threats++;
				}
			}
			System.out.println(threats);
		}
	}
}
