package solid03liskovsustitution.lkscase1;

import java.util.List;

public class PerimeterOperations {
	public static double SumPerimeters(List<GeometricShape> shapes)
    {
        double perimeter = 0;
    	for(GeometricShape shape : shapes) {
        	perimeter = perimeter + shape.calculatePerimeter();
        }
		return perimeter;
    }
}
