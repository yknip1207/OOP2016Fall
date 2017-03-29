package OOP_HW7;

public class Circle extends Shape{
	private final double pi = 3.14159;
	private double length;
	private double radius;
	Circle(double l) {
//		super(l);
		this.length = l;
	}

	public double getArea(){
		this.radius = this.length / 2;
		return Math.round(this.radius * this.radius * pi * 100) / 100.0;
		
	}
	public double getPerimeter(){
		return Math.round(this.length * pi * 100) / 100.0;
	}
	public String getInfo(){
		return super.getInfo();
	}
	@Override
	public void setLength(double length) {
		this.length = length;
	}
}
