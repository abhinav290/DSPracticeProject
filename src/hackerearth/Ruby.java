package src.hackerearth;

import java.util.Scanner;

public class Ruby {

	public static void main(String[] args) {
	int a[] = new int[5];
	Scanner s= new Scanner(System.in);
	int t=s.nextInt();
	for(int i=0;i<t;i++) {
		initArr(a,0);
		String str= s.nextLine();
		for(int j=0;j<str.length();j++) {
			a[getIndex(str.charAt(j))]++;
		}
		int res=a[0];
		for(int j=1;j<a.length-1;j++) {
			if(res>a[j]) {
				res=a[j];
			}
		}
		System.out.println(res);
	}
	}
	public static void initArr(int []a,int val) {
		for(int i=0;i<a.length;i++) {
			a[i]=val;
		}
	}
public static int getIndex(char c) {
	if(c=='r') {
		return 0;
	} else if(c=='u') {
		return 1;
	} else 	if(c=='b') {
		return 2;
	} else  if(c=='y'){
		return 3;
	}
	return 4;
}
}
