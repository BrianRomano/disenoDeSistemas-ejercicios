package solid05dependencyinversion.diycase1;

import java.util.ArrayList;
import java.util.List;

public class GreatCalculator {

	private double totalAreas;
	private double totalPerimeter;
	
	public void setTotalAreas(double totalAreas) {
		this.totalAreas = totalAreas;
	}
	
	public double getTotalAreas() {
		return totalAreas;
	}
	
	public void setTotalPerimeter(double totalPerimeter) {
		this.totalPerimeter = totalPerimeter;
	}
	
	public double getTotalPerimeter() {
		return totalPerimeter;
	}
	
	public void calculate() {
		List<GeometricShape> shapes = new ArrayList<GeometricShape>();
		
		shapes.add(new Rectangle(10, 5));
		shapes.add(new Rectangle(4, 6));
		shapes.add(new Rectangle(5, 1));
		shapes.add(new Rectangle(8, 9));
		shapes.add(new EquilateralTriangle(10));
		shapes.add(new EquilateralTriangle(5));
		shapes.add(new EquilateralTriangle(3));
		
		this.setTotalAreas(AreaOperations.SumAreas(shapes));
		this.setTotalPerimeter(PerimeterOperations.SumPerimeters(shapes));
		
	}

}
