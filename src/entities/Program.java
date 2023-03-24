package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Shape> myShapes = new ArrayList<Shape>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		/*list.add(new Rectangle(3.0, 4.0)); Em curingas delimitados não
		 * é possível adicionar elementos a lista */
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
