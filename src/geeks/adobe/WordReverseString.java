package geeks.adobe;

import java.util.*;

public class WordReverseString {

	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		int i,t,j,k;
		t=s.nextInt();
		for(i=0;i<t;i++) {
			String input =s.next();
			String [] arr =input.split("\\.");
			for(j=0,k=arr.length-1;j<=k;j++,k--) {
				String temp =arr[j];
				arr[j] =arr[k];
				arr[k]=temp;
			}
			System.out.println(String.join(".",arr));
		}
	}
}
