package assignment3.Rectangle;

public class Tester {
	public static void main(String[] args) {
       
        Rectangle Rect = new Rectangle(3.5f,4.5f);

        System.out.println("Area: " + Rect.getArea());
        System.out.println("Perimeter: " + Rect.getPerimeter());
        System.out.println();

        
        Rectangle Rect1 = new Rectangle();
          Rect1.setLength(5.5f);
          Rect1.setLength(6.5f);
          System.out.println("Rect1 object: " + Rect1);
        System.out.println("Area: " + Rect1.getArea());
        System.out.println("Perimeter: " + Rect1.getPerimeter());
        
        System.out.println();
	
}
}
