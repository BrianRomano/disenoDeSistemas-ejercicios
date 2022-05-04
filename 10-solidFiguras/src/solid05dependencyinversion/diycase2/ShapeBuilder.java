package solid05dependencyinversion.diycase2;

import java.util.ArrayList;
import java.util.List;

import solid05dependencyinversion.diycase2.EquilateralTriangle;
import solid05dependencyinversion.diycase2.GeometricShape;
import solid05dependencyinversion.diycase2.Rectangle;

public class ShapeBuilder {
	
	public static List<GeometricShape> getShapes() {
		List<GeometricShape> shapes = new ArrayList<GeometricShape>();
		
		shapes.add(new Rectangle(10, 5));
		shapes.add(new Rectangle(4, 6));
		shapes.add(new Rectangle(5, 1));
		shapes.add(new Rectangle(8, 9));
		shapes.add(new EquilateralTriangle(10));
		shapes.add(new EquilateralTriangle(5));
		shapes.add(new EquilateralTriangle(3));

		return shapes;
	}


}
