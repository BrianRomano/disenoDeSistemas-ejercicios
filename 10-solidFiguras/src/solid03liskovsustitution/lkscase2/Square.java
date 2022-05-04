package solid03liskovsustitution.lkscase2;

public class Square extends Shape implements GeometricShape {

    public static final int SIDES = 4;

	private double sideLength;
	
	// Constructor
	public Square() {
		super();
	}
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	//Getters and Setters
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.sideLength * this.sideLength;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return this.sideLength * 4;
	}
	

}
