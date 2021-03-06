package shapes;

public class Square extends Quadrilateral implements Measurable {

    //constructor
    public Square(double side){
        super(side, side);
        //OR
        //this.width = side;
//        this.length = side;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
       return Math.pow(length, 2);
       //or
        //return length * length;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

//
//    public double getArea(double side){
//        System.out.println("Calculating square area...");
//        return 4 * side;
//        //Javier's solution
////         super(side, side);
//        //this.side = side;
//    }
////Javier's solution
////    public double getArea(){
////        return side * side;
////    }
//
//    public double getPerimeter(double side){
//        System.out.println("Calculating square perimeter...");
//        return 4 * side;
//    }
}