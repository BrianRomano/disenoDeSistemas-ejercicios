package solid02openclose.opclcase2;

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
	}

}
