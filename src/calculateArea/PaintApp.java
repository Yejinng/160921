package calculateArea;

public class PaintApp {
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(2);
		point.setY(5);

		point.show();

		Point point2 = new Point(10, 23);
		point2.show(true); // true써도되고 안써도됨
		point2.show(false);

		Point point3 = new ColorPoint(50, 50, "red");
		point3.show();
		point3.show(false);
		point3.show(true);

		Rectangle rectangle = new Rectangle();
		// rectangle.draw();
		draw(rectangle);
		draw(new Circle()); // 밑에처럼 하나하나 안해도되고 이렇게 한꺼번에 해도됨
		draw(new Triangle());
		// Circle circle = new Circle();
		// circle.draw();

		// Circle circle = new Circle();
		// draw(circle);

		// Triangle triangle = new Triangle();
		// // triangle.draw();
		// draw(triangle);
		draw(new ColorPoint(200,100,"white"));
		
		resize(new Circle(20));
		resize(new Circle(10));
		
		//instanceof Test
		Circle c10 = new Circle();
		System.out.println(c10 instanceof Circle);
		//오류 instanceof 는 상속관계에있는 클래스만 확인할 수 있다.
		/*System.out.println(c10 instanceof Rectangle);*/	//사용불가(상속관계가 아니라서)\
		System.out.println(c10 instanceof Shape);
		//instanceof는 모든 인터페이스에 구현관계를 확인할 수 있다
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);
		
		Rectangle rect = new Rectangle();
		System.out.println(rect instanceof Rectangle);
		System.out.println(rect instanceof Shape);
		System.out.println(rect instanceof Drawable);
		System.out.println(rect instanceof Resizable);
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

	public static void resize2(Drawable drawable){
		if(drawable instanceof Resizable == false){
			
		}
		Resizable re =(Resizable)drawable;
		re.resize(0.8);
	}
	public static void resize(Resizable resizable) {
		Shape shape = (Shape) resizable;
		double area = shape.calculateArea();

		resizable.resize(0.5);
		System.out.println(area);

	}

	// public static void draw(Circle circle) {
	// circle.draw();
	// }
	//
	// public static void draw(Rectangle rectangle) {
	// rectangle.draw();
	// }
	//
	// public static void draw(Triangle triangle) {
	// triangle.draw();
	// }
}
