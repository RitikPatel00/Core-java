package assignment3.problem10;

public class TestMovable {
    public static void main(String[] args) {
        
        Movable m1 = new MovablePoint(5, 5, 1, 1);
        System.out.println("Initial MovablePoint: " + m1);
        m1.moveDown();
        System.out.println("After moveDown(): " + m1);
        m1.moveRight();
        System.out.println("After moveRight(): " + m1);


        Movable m2 = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("\nInitial MovableCircle: " + m2);
        m2.moveUp();
        System.out.println("After moveUp(): " + m2);
        m2.moveLeft();
        System.out.println("After moveLeft(): " + m2);
    }
}