package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    //constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
//    //variables
//    protected double length;
//    protected double width;
//
//    //empty constructor
//    public Rectangle(){};
//
//    //constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //getters and setters
//    public void setLength(double length){
//        this.length = length;
//    }
//
//    public double getLength(){
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    //calculate area
//    public double getArea(){
//        System.out.println("Calculating rectangle area...");
//        return this.length * this.width;
//    }
//
//    //calculate perimeter
//    public double getPerimeter(){
//        System.out.println("Calculating rectangle perimeter...");
//        return ((this.length*2) + (this.width*2));
//    }
//}

