package solid02openclose.opclcase1;

import java.util.List;

public class AreaOperations {
	
	public static double SumAreas(List<Shape> shapes)
    {
        double area = 0;
    	for(Shape shape : shapes) {
        	if (shape instanceof Rectangle) {
        		area = area + ((Rectangle) shape).calculateArea();
        	} else if (shape instanceof EquilateralTriangle) {
        		area = area + ((EquilateralTriangle) shape).calculateArea();
        	}
    	}
		return area;
    }

}
