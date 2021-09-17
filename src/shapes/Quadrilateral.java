package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    //variables
    protected double length;
    protected double width;

    //constructor
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    //empty constructor
//    public Quadrilateral(){}


    //getters and setters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }



    //abstract length and width setters and getters
    abstract void setLength(double length);
    abstract void setWidth(double width);

    //how Jusin did it
//    public  void setLength;
//    public void setWidth;




}
