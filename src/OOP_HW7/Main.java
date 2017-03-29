package OOP_HW7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape triangle = shapeFactory.createShape(ShapeFactory.Type.Triangle, 7.5);
		Shape square = shapeFactory.createShape(ShapeFactory.Type.Square, 5);
		Shape circle = shapeFactory.createShape(ShapeFactory.Type.Circle, 5);
		System.out.println(square.getArea() > triangle.getArea());
		System.out.println(triangle.getArea() > circle.getArea());
		System.out.println(circle.getPerimeter() > triangle.getPerimeter());
		System.out.println(square.getPerimeter() > circle.getPerimeter());
		triangle.setLength(10.5);
		square.setLength(7.2);
		circle.setLength(10);
		System.out.println(square.getArea() > triangle.getArea());
		System.out.println(triangle.getArea() > circle.getArea());
		System.out.println(circle.getPerimeter() > triangle.getPerimeter());
		System.out.println(square.getPerimeter() > circle.getPerimeter());
		System.out.println(triangle.getInfo());
		System.out.println(square.getInfo());
		System.out.println(circle.getInfo());
		
		System.out.println();
	}

}
