package abstractAndInterface;

public class Rectangle extends Shape {
	private int a,b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	
	public void area() {
		System.out.println(a*b);
	}

	
	public void perimeter() {
		System.out.println(2*(a+b));
	}
}
