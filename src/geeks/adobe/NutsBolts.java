package geeks.adobe;

import java.util.Scanner;

public class NutsBolts {
	public static final String hashString = "!#$%&*@^~";
	public static void main(String[] args) {
		Integer a[] = new Integer[9];
		int t,n;

		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int j=0;j<t;j++) {
			initArr(a, 0);
			n=s.nextInt();
			for(int i=0;i<n;i++) {	
				char c = s.next(".").charAt(0);	
				int index = getHashCode(c);				
//				System.out.print(c +" " + index +" , ");
				a[index]++;
			}
			for(int i=0;i<n;i++) {	
				char c = s.next(".").charAt(0);			
				int index = getHashCode(c);				
//				System.out.print(c +" " + index +" , ");
				a[index]++;
			}
			for(int i=0;i<a.length;i++) {
				if(a[i]==2) {
					System.out.print(hashString.charAt(i) + " ");
				}
			}
			for(int i=0;i<a.length;i++) {
				if(a[i]==2) {
					System.out.print(hashString.charAt(i) + " ");
				}
			}
			System.out.println();
		}
	}
	public static int getHashCode(char c) {
		return hashString.lastIndexOf(c);
	}
	public static <T extends Number> void  initArr(T []a,T val) {
		for(int i=0;i<a.length;i++) {
			a[i]=val;
		}
	}
}
