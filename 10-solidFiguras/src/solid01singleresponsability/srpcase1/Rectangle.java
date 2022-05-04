package solid01singleresponsability.srpcase1;

import java.util.List;

public class Rectangle
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
	public static double calculateArea(Rectangle rectangle) {
		return rectangle.height * rectangle.width;
	}

	public static double calculatePerimeter(Rectangle rectangle) {
		return (rectangle.height * 2) + (rectangle.width * 2);
	}
	
	public static double SumAreas(List<Rectangle> rectangles)
    {
        double area = 0;
    	for(Rectangle rectangle : rectangles) {
        	area = area + calculateArea(rectangle);
        }
		return area;
    }

	public static double SumPerimeters(List<Rectangle> rectangles)
    {
        double perimeter = 0;
    	for(Rectangle rectangle : rectangles) {
        	perimeter = perimeter + calculatePerimeter(rectangle);
        }
		return perimeter;
    }
	
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
}