package hackerearth.december;

import java.util.Scanner;

public class VideoBuffer {

	public static void main(String[] args) {
		int n,d,x,b=0,t=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		d=s.nextInt();
		for(int i=0;i<n;i++) {
			x=s.nextInt();			
			if(b<d) {
				t+=x;
				b+=x;
				continue;
			}
			b-=d;
		}
		System.out.println(t);
	}
}
