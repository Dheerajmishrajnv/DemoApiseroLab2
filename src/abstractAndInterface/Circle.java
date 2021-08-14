package abstractAndInterface;

public class Circle extends Shape {
	private int redius;

	public Circle(int redius) {
		
		this.redius = redius;
	}

	public void area() {
		System.out.println((float)(3.14*redius*redius));
	}

	public void perimeter() {
		System.out.println((float)(2*3.14*redius));
	}
}
