package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public double getArea(double side){
        System.out.println("Calculating square area...");
        return 4 * side;
        //Javier's solution
//         super(side, side);
        //this.side = side;
    }
//Javier's solution
//    public double getArea(){
//        return side * side;
//    }

    public double getPerimeter(double side){
        System.out.println("Calculating square perimeter...");
        return 4 * side;
    }
}
