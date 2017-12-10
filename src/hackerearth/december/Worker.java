package hackerearth.december;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Worker {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s= new Scanner(System.in);
        int n,a[],i;
        long sum=0;
        n=s.nextInt();
        a=new int[2*n];
        for(i=0;i<2*n;i++) {
        	a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<2*n;i+=2) {
        	sum =sum +min(a[i],a[i+1]);
        }
        System.out.println(sum);
	}
	public static int min (int a ,int b) {
		return a>b?b:a;
	}
}
