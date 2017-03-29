package OOP_CH7_ObjectEqual;

public class D {
	private int x;
	public D(){};
	public D(int x){this.x=x;}
	public String toString(){return "X:" + this.x;}
	public boolean equals(D o){ 
//		return this.x == o.x;
		if (o == null) return false;
		else if(this.getClass() != o.getClass())
			return false;
		else
			return this.x == ((D)o).x;
	}
}
