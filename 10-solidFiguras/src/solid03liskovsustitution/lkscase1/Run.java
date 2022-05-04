package solid03liskovsustitution.lkscase1;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GeometricShape> shape = new ArrayList<GeometricShape>();
		
		shape.add(new Rectangle(10, 5));
		shape.add(new Rectangle(4, 6));
		shape.add(new Rectangle(5, 1));
		shape.add(new Rectangle(8, 9));
		shape.add(new EquilateralTriangle(10));
		shape.add(new EquilateralTriangle(5));
		shape.add(new EquilateralTriangle(3));
		
		System.out.println("Sum of Area: " + AreaOperations.SumAreas(shape));
		System.out.println("Sum of Perimeter: " + PerimeterOperations.SumPerimeters(shape));
		
		Square rect = new Square();
		rect.setHeight(10);
		rect.setWidth(5);
		double areaExpected = 50;
		if (rect.calculateArea() == areaExpected) {
			System.out.println("El area esperada: "+ areaExpected + " es igual a la calculada: " + rect.calculateArea());
		} else {
			System.out.println("El area esperada: "+ areaExpected + " es distinta a la calculada: " + rect.calculateArea());
		}
		
		
	}

}
