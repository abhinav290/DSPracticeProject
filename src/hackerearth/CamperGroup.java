package src.hackerearth;
import java.util.Scanner;

class TestClass {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,length,j,k,m,n,c,d,t;
		t=s.nextInt();
		for(m=0;m<t;m++) {
			String str =s.next();
			length = str.length();   
			d=0;
			n=str.length();
			if(str.indexOf((int) 'a')>=0 || str.indexOf((int) 'z')>=0) {
				for ( i = 0; i < n; i++) {
					for ( j = i+1; j <= n; j++) {

						// Please refer below article for details
						// of substr in Java
						// http://www.geeksforgeeks.org/java-lang-string-substring-java/
						//System.out.println(str.substring(i, c+i));
						if(str.substring(i, j).indexOf((int) 'a')>=0 ||str.substring(i, j).indexOf((int) 'z')>=0 ){
							//   System.out.println(str.substring(i, c+i));
							d++;
						}
					}
				}
			}
			System.out.println(d);
		}
	}
}
