package solid04interfacesegregation.isgcase2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GeometricShape> shape = new ArrayList<GeometricShape>();
		
		Rectangle rect1 = new Rectangle(10, 5);
		
		shape.add(rect1);
		shape.add(new Rectangle(4, 6));
		shape.add(new Rectangle(5, 1));
		shape.add(new Rectangle(8, 9));
		shape.add(new EquilateralTriangle(10));
		shape.add(new EquilateralTriangle(5));
		shape.add(new EquilateralTriangle(3));
		
		System.out.println("Sum of Area: " + AreaOperations.SumAreas(shape));
		System.out.println("Sum of Perimeter: " + PerimeterOperations.SumPerimeters(shape));
		
		Square square = new Square();
		square.setSideLength(10);
		double areaExpected = 40;
		if (square.calculateArea() == areaExpected) {
			System.out.println("El area esperada: "+ areaExpected + " es igual a la calculada: " + square.calculateArea());
		} else {
			System.out.println("El area esperada: "+ areaExpected + " es distinta a la calculada: " + square.calculateArea());
		}	
	}

}
