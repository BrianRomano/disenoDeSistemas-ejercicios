package solid05dependencyinversion.diycase1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreatCalculator calculator = new GreatCalculator();
		calculator.calculate();

		System.out.println("Sum of Area: " + calculator.getTotalAreas());
		System.out.println("Sum of Perimeter: " + calculator.getTotalPerimeter());

		
	}

}
