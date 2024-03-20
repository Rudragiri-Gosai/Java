class Shape {
	public void display() {
		System.out.println("shape class");
	}
}

class Circle extends Shape {
	public void displayc() {
		System.out.println("Circle class");
	}
}

class Rectangle extends Shape {
	public void displayr() {
		System.out.println("Rectangle class");
	}
}

class Triangle extends Shape {
	public void displayt() {
		System.out.println("Triangle class");
	}
}

public class p9 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		c.display();
		c.displayc();
		r.display();
		r.displayr();
		t.display();
		t.displayt();
	}
}
