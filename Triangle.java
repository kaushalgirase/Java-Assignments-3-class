//1
package assignment3;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}

	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);

		System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter() + " units");
		System.out.println("Area of the triangle: " + triangle.calculateArea() + " square units");
	}


}
