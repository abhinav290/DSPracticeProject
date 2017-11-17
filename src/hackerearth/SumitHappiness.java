package hackerearth;

import java.util.*;

public class SumitHappiness {

	public static void main(String[] args) {
		int t,j,n,i,sum=0,max=0,a[];
//		List<Integer> a= new ArrayList<>();

		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		for(j=0;j<t;j++) {
			n=s.nextInt();
			a = new int[n];
			for(i=0;i<n;i++) {
				a[i] = s.nextInt();	
			}
			i=1;
			for(int item :a) {
				if(((sum+item)*(i+1)) > (max+item)) {
					max=(sum+item)*(i+1);
				} else{
					max+=item;
				}
				i++;
				sum+=item;
			}
			System.out.println(max);
		}
	}

}
