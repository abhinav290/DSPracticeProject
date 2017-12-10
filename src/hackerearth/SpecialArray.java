package hackerearth;

import java.util.*;
public class SpecialArray {
	boolean[] primes=new boolean[1000001];

	public void fillSieve() {
		Arrays.fill(primes,true);        // assume all integers are prime.
		primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
		for (int i=2;i<primes.length;i++) {
			//if the number is prime,
			//then go through all its multiples and make their values false.
			if(primes[i]) {
				for (int j=2;i*j<primes.length;j++) {
					primes[i*j]=false;
				}
			}
		}
	}

	public static void main(String args[] ) throws Exception {
		SpecialArray obj= new SpecialArray();
		Scanner s = new Scanner(System.in);
		int pC=0,nPc=0;
		obj.fillSieve();
		int n=s.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		for(int i=0;i<n;i++) {
			int x=s.nextInt();
			if(obj.primes[x]) {
				a[pC++]=x;
			} else {
				b[nPc++]=x;
			}
			Arrays.sort(a,0,pC);
			Arrays.sort(b,0,nPc);
			for(i=0;i<pC;i++) {
				System.out.print(a[i] + " ");
			}
			for(i=nPc-1;i>=0;i--) {
				System.out.print(b[i] + " ");
			}

		}
	}

}
