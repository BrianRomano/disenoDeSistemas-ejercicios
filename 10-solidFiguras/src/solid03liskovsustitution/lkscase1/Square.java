package solid03liskovsustitution.lkscase1;

public class Square extends Rectangle {

	// Constructor
	public Square() {
		super();
	}
	
	public Square(double sideLength) {
		super(sideLength, sideLength);
		// TODO Auto-generated constructor stub
	}
	
	//Getters and Setters
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}
}
