package solid05dependencyinversion.diycase2;

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
	
	public void calculate(List<GeometricShape> shapes) {
		this.setTotalAreas(AreaOperations.SumAreas(shapes));
		this.setTotalPerimeter(PerimeterOperations.SumPerimeters(shapes));
	}

}
