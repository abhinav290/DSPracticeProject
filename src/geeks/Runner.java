package geeks;

public class Runner {
public static void main(String[] args) {
Shape s= new Square();
s.foo();
((Square)s).foo();
}
}

class  Shape {
	public void foo() {
		System.out.println("Shape");
	}

}
class Square extends Shape
{
	public void foo() {
		System.out.println("Square");
	}
}