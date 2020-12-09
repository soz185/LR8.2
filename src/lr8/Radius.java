package lr8;

import java.util.Scanner;

public class Radius {
	private double radius;
	public Radius() {
		radius = 0;
	}
	public Radius(double rad) {
		radius = rad;
	}
	public void initRadius(double rad) {
		radius = rad;
	}
	public void readRadius() {
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
	}
	public void displayRadius() {
		System.out.printf("%g", radius);
	}
	public Object addRadius(Radius rad1, Radius rad2) {
		radius = rad1.radius + rad2.radius;
		return this;
	}
	public double returnRadius() {
		return radius;
	}
}
