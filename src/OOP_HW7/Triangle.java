package OOP_HW7;

public class Triangle extends Shape {
	private final double root3 = 1.73205;
	private double length;
	Triangle(double length){
//		super(length);
		this.length = length;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return Math.round(this.length * this.length * root3 / 4 * 100 ) / 100.0;
	}

	@Override
	public double getPerimeter() {
		return Math.round(3 * this.length * 100) / 100.0;
	}

	@Override
	public String getInfo() {
		return super.getInfo();
	}

}
