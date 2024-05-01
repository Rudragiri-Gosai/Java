public class p6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        
        printCircleDetails(circle1);
    }
    
    public static void printCircleDetails(Circle circle) {
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println();
    }
}

class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }
}
