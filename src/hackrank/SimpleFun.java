package hackrank;

import java.util.Scanner;

public class SimpleFun {

    public static void main(String[] args) {
        int k,n;
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0) {
            k=s.nextInt();
            n=s.nextInt();
            System.out.println(simpleFunc(k,n));        
            t--;
        }
     }
    	public static long simpleFunc(int k,int n)  {
		long sum=0,mod=1000000007;
		for(int i=1;i<=n;i++) {
			sum=(sum+((k-1)*i*(n-i+1)))%mod;
		}
		return sum;
	}
}
