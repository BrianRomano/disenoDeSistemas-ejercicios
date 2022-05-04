package solid05dependencyinversion.diycase2;

import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreatCalculator calculator = new GreatCalculator();
		
		List<GeometricShape> shapes = ShapeBuilder.getShapes();
		
		calculator.calculate(shapes);

		System.out.println("Sum of Area: " + calculator.getTotalAreas());
		System.out.println("Sum of Perimeter: " + calculator.getTotalPerimeter());

		
	}

}
