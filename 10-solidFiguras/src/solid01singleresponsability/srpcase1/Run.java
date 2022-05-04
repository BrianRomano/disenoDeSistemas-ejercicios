package solid01singleresponsability.srpcase1;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		
		rectangles.add(new Rectangle(10, 5));
		rectangles.add(new Rectangle(4, 6));
		rectangles.add(new Rectangle(5, 1));
		rectangles.add(new Rectangle(8, 9));
		
		
		System.out.println("Sum of Area: " + Rectangle.SumAreas(rectangles));
		System.out.println("Sum of Perimeter: " + Rectangle.SumPerimeters(rectangles));
	}

}
