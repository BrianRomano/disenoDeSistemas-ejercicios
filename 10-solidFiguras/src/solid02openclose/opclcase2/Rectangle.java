package solid02openclose.opclcase2;

public class Rectangle extends Shape implements GeometricShape
{
    public static final int SIDES = 4;
    private double height; 
    private double width;

    // Constructor
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	// Getters and Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	    
    // Metodos 
	public double calculateArea() {
		return this.height * this.width;
	}

	public double calculatePerimeter() {
		return (this.height * 2) + (this.width * 2);
	}
		
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
}