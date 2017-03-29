package OOP_HW7;

public abstract class Shape {
//	private double length;
	Shape(){}
	Shape(double l){
//		this.length = l;
	}
	public abstract void setLength(double length);
	public abstract double getArea();
	public abstract double getPerimeter();
	public String getInfo(){
		return "Area = " + getArea() + ", Perimeter = " + getPerimeter(); 
	}
}
