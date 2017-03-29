package OOP_HW7;

public class ShapeFactory {
	
	enum Type{
		Triangle,
		Square,
		Circle,
	}
	
	public Shape createShape(Type shapeType, double length){
		Shape result = null; 
		
		switch(shapeType){
			case Circle:
				result = new Circle(length);
				break;
			case Triangle:
				result = new Triangle(length);
				break;
			case Square:
				result = new Square(length);
				break;
		}
		return result;
		
	}
	

}
