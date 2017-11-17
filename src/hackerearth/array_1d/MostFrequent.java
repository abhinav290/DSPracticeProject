package hackerearth.array_1d;

import java.util.*;

public class MostFrequent {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		Scanner s= new Scanner(System.in);
		int i,p=0,pc=0,c=0,v=0,n;
		n=s.nextInt();
		for(i=0; i<n;i++) {
			list.add(s.nextInt());
		}
		Collections.sort(list);
		for(int k:list) {
			if(k==p) {
				pc++;
				continue;
			}
			if(pc>c) {
				c=pc;
				v=p;
			}
			pc=1;
			p=k;
		}
		if(pc>c) {
			c=pc;
			v=p;
		}
		System.out.println(v);
	}

}
