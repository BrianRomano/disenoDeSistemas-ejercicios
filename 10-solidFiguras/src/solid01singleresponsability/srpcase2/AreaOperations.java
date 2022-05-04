package solid01singleresponsability.srpcase2;

import java.util.List;

public class AreaOperations {
	
	public static double SumAreas(List<Rectangle> rectangles)
    {
        double area = 0;
    	for(Rectangle rectangle : rectangles) {
        	area = area + rectangle.calculateArea();
        }
		return area;
    }

}
