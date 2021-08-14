package abstractAndInterface;

public class AbstractDriver {

	public static void main(String[] args) {
		Shape s1 = new Triangle(1, 2, 3, 4, 6);
		s1.area();
		s1.perimeter();
		Shape s2 = new Rectangle(12,15);
		s2.area();
		s2.perimeter();
		Shape s3 = new Circle(7);
		s3.area();
		s3.perimeter();

	}

}
