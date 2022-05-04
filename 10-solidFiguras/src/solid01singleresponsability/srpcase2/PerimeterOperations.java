package solid01singleresponsability.srpcase2;

import java.util.List;

public class PerimeterOperations {
	public static double SumPerimeters(List<Rectangle> rectangles)
    {
        double perimeter = 0;
    	for(Rectangle rectangle : rectangles) {
        	perimeter = perimeter + rectangle.calculatePerimeter();
        }
		return perimeter;
    }

}
