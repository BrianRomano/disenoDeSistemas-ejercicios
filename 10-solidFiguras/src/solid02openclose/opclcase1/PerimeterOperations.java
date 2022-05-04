package solid02openclose.opclcase1;

import java.util.List;

public class PerimeterOperations {
	public static double SumPerimeters(List<Shape> shapes)
    {
        double perimeter = 0;
    	for(Shape shape : shapes) {
        	if (shape instanceof Rectangle) {
        		perimeter = perimeter + ((Rectangle) shape).calculatePerimeter();
        	} else if (shape instanceof EquilateralTriangle) {
        		perimeter = perimeter + ((EquilateralTriangle) shape).calculatePerimeter();
        	}
        }
		return perimeter;
    }
}
