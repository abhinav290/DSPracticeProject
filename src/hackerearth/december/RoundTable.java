package hackerearth.december;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class RoundTable {

	public static void main(String[] args) {
		Map<Integer,List<Integer>> map= new HashMap();
		Scanner s= new Scanner(System.in);
		int n,i,j,k,q,x,y;
		n=s.nextInt();
		q=s.nextInt();
		for(i=0;i<n;i++) {
			x=s.nextInt();
			if(!map.containsKey(x)) {
				map.put(x, new ArrayList<>());
			}
			map.get(x).add(i+1);
		}
		for(i=0;i<q;i++) {
			x=s.nextInt();
			y=s.nextInt();
			k=minDiff(map.get(x),map.get(y),n)/2;
			System.out.println(k);
		}

	}
	public static int minDiff(List<Integer> x, List<Integer> y,int n) {
/*		x.forEach(item-> System.out.print(item + " , "));
		System.out.println();
		y.forEach(item-> System.out.print(item + " , "));*/
		int result = Integer.MAX_VALUE;
	    int a=0,b=0,r1=0,r2=0;  
        while (a < x.size() && b < y.size())
        {
            if (Math.abs(x.get(a) - y.get(b)) < result) {
                result = Math.abs(x.get(a) - y.get(b));
               if(x.get(a)>=y.get(b)){
            	   r1=n-x.get(a)+y.get(b);
            	   result=result>r1?r1:result;
               } else {
             	   r1=n-y.get(b)+x.get(a);
            	   result=result>r1?r1:result;
               }
            }
      
            if (x.get(a) < y.get(b))
                a++;
      
            else
                b++;
        }
         
        return result; 
	}
}
