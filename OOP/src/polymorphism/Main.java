package polymorphism;

public class Main {
	 public static void main(String[] args) {

	        // Rectangle test
	        double width = 3, length = 2;
	        Figure rectangle = new Rectangle(width, length);
	        System.out.println("Rectangle width: " + width + " and length: " + length
	                + "\nRectangle area: " + rectangle.area()
	                + "\nRectangle perimeter: " + rectangle.perimeter() + "\n");

	        // Circle test
	        double radius = 5;
	        Figure circle = new Circle(radius);
	        System.out.println("Circle radius: " + radius
	            + "\nCircle Area: " + circle.area()
	            + "\nCircle Perimeter: " + circle.perimeter() + "\n");

	       
	    }
}
