package shapes;

public class Rectangle{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

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

    public double getArea(){
        System.out.println("Calculating rectangle area...");
        return this.length * this.width;
    }

    public double getPerimeter(){
        System.out.println("Calculating rectangle perimeter...");
        return ((this.length*2) + (this.width*2));
    }




}
