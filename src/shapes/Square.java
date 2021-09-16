package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public double getArea(double side){
        System.out.println("Calculating square area...");
        return 4 * side;
    }

    public double getPerimeter(double side){
        System.out.println("Calculating square perimeter...");
        return 4 * side;
    }
}
