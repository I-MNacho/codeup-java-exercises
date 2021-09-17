package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        //Rectangle myShape
        Rectangle myShape = new Rectangle(2,4);
        System.out.println("Length: " + myShape.getLength());
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Width: " + myShape.getWidth());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        //Square
        Square square = new Square(3);
        System.out.println("Area: " + square.getArea());

    }





//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5.00, 4.00);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5.00);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//    }
}
