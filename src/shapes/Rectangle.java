package shapes;

public class Rectangle{

    //variables
    protected double length;
    protected double width;

    //empty constructor
    public Rectangle(){};

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getters and setters
    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //calculate area
    public double getArea(){
        System.out.println("Calculating rectangle area...");
        return this.length * this.width;
    }

    //calculate perimeter
    public double getPerimeter(){
        System.out.println("Calculating rectangle perimeter...");
        return ((this.length*2) + (this.width*2));
    }
}
