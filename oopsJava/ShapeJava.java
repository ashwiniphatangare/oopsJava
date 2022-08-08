package oopsJava;
class shape{
	void area() {
		
	}
}
class Circle extends shape{
	void area() {
		int r=2;
		final double pi=3.14,area;
		area=pi*r*r;
		System.out.println("area of circle is:"+area);
	}
}
class Triangle extends shape{
	void area() {
		float b=4;
		float h=30,area;
		area=(b*h)/2;
		System.out.println("area of trianle is:"+area);

	}
}
class Rectangle extends shape{
	void area() {
		int width=6;
		int heigth=7;
		int area=width*heigth;
		System.out.println("area of rectangle is:"+area);

	}
}
public class ShapeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Circle c=new Circle();
    c.area();
    Rectangle r=new Rectangle();
    r.area();
    Triangle t=new Triangle();
    t.area();
	}

}
