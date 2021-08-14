package abstractAndInterface;

public class Triangle extends Shape {
	private int a,b,c,base,height;

	public Triangle(int a, int b, int c, int base, int height) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.height = height;
	}

	public void area() {
		System.out.println((float)(0.5*base*height));
	}
	public void perimeter() {
		System.out.println(a+b+c);
	}
}
