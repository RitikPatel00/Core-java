package assignment3.shapes;

public class ShapeTest {
    public static void main(String[] args) {
       
        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.getArea());

        Circle circle2 = new Circle(2.5, "blue");
        System.out.println("\nCircle 2: " + circle2);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.getArea());

        
        Cylinder cylinder1 = new Cylinder();
        System.out.println("\nCylinder 1: " + cylinder1);
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Color: " + cylinder1.getColor());
        System.out.println("Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3.0, 5.0, "green");
        System.out.println("\nCylinder 2: " + cylinder2);
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Color: " + cylinder2.getColor());
        System.out.println("Volume: " + cylinder2.getVolume());

        
        circle1.setRadius(4.0);
        circle1.setColor("yellow");
        System.out.println("\nUpdated Circle 1: " + circle1);
        System.out.println("Area: " + circle1.getArea());

        cylinder2.setRadius(2.5);
        cylinder2.setHeight(7.0);
        cylinder2.setColor("red");
        System.out.println("\nUpdated Cylinder 2: " + cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());
    }
}
