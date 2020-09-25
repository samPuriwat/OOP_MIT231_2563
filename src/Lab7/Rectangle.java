package Lab7;

public class Rectangle {
    //class attributes
    private double length;
    private double width;
    //constructor
    public Rectangle(){
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double getLength(){
            return length;
        }
        public void setLength(double newLength){
            length = newLength;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double newWidth){
            width = newWidth;
        }
        public double findRectangleArea(){
            return length * width;  // area
        }

}//class
