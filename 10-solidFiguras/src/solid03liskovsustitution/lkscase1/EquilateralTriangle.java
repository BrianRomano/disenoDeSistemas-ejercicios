package solid03liskovsustitution.lkscase1;

public class EquilateralTriangle extends Shape implements GeometricShape
{
    public static final int SIDES = 3;
    private double sideLength; 

    // Constructor
    public EquilateralTriangle() {
    	
    }
    
    public EquilateralTriangle(double side) {
		super();
		this.sideLength = side;
	}

	// Getters and Setters
	public double getSide() {
		return sideLength;
	}
	
	public void setSide(double side) {
		this.sideLength = side;
	}
	
    // Metodos 
	public double calculateArea() {
		return (Math.sqrt(SIDES) / 4) * Math.pow(sideLength, 2)  ;
	}

	public double calculatePerimeter() {
		return (this.sideLength * 3);
	}
		
	@Override
	public String toString() {
		return "EquilateralTriangle [sideLength=" + sideLength + "]";
	}
	
}