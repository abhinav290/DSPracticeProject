package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		bullet();
	}
	public static void bullet() {
		int t,n,i,flag,j,w[],d,x;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		
		for(i=0;i<t;i++) {
			n=s.nextInt();
			w=new int[n];
			d=0;
			x=0;
			flag=0;
			for(j=0;j<n;j++) {
				w[j]=s.nextInt();
			}
			Arrays.sort(w);
			for(j=0;j<n;j++) {
				if(w[j]-d>0) {
					x++;
				} else {
					flag=1;
					break;
				}
				d++;
				if(d%6==0) {
					d++;
				}
			}
			if(flag==1) {
				System.out.println("Goodbye Rick\n"+x);
			} else {
				System.out.println("Rick now go and save Carl and Judas");
			}
		}

	}
}
