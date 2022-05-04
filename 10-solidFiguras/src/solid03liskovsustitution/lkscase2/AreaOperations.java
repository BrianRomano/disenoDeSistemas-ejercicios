package solid03liskovsustitution.lkscase2;

import java.util.List;

public class AreaOperations {
	
	public static double SumAreas(List<GeometricShape> shapes)
    {
        double area = 0;
    	for(GeometricShape shape : shapes) {
        	area = area + shape.calculateArea();
    	}
		return area;
    }

}
