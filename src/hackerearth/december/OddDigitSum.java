package hackerearth.december;

import java.util.Scanner;

public class OddDigitSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j,t,n;
		t=s.nextInt();
		for(j=0;j<t;j++) {
			n=s.nextInt();
			System.out.println(factors(n));
		}
		s.close();
	}
	public static int factors(int n) {
		int s=0;
		for (int i=1; i<=Math.sqrt(n)+1; i++){
			if (n%i==0) {
				if (n/i == i) 
					s=s+sumOdd(i);

				else 
					s=s+sumOdd(i)+sumOdd(n/i);
			}
		}
		return s;
	}
	public static int sumOdd(int n) {
		int r=0,x=0;

		while(n!=0) {
			r=(n%10);
			//System.out.println(r);
			if (r%2!=0) {
				x=x+r;
			}
			n=n/10;
		}
		return x;
	}
}
