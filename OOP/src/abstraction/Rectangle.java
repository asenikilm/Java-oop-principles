package abstraction;

public class Rectangle extends Figure {
	private final double width, height ; //sides

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
