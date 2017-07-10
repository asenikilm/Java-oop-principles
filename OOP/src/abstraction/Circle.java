package abstraction;

public class Circle extends Figure {
	private final double radius;
	   
    public Circle() {
    	this.radius = 1;
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        
        return 2 * Math.PI * radius;
    }
}