package OOP_HW7;

public class Square extends Shape {
	private double length;
	Square(double l) {
//		super(l);
		this.length = l;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return Math.round(this.length * this.length * 100) / 100.0;
	}

	@Override
	public double getPerimeter() {
		return Math.round(this.length * 4 * 100 ) / 100.0;
	}

	@Override
	public String getInfo() {
		return super.getInfo();
	}

}
