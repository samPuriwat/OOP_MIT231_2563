package Lab7;

public class RectangleApp {

    public static void main(String[] args) {

        //create object of Rectangle class
        Rectangle r1 = new Rectangle(); // create object as r1
        r1.setLength(10.0);
        r1.setWidth(5.0);
        //display attributes of object
        displayObjectAttribute(r1);
        //find area of rectangle
        findArea(r1);

        Rectangle r2 = new Rectangle(); // create object as r1
        r2.setLength(20.0);
        r2.setWidth(30.0);
        displayObjectAttribute(r2);
        findArea(r2);

        Rectangle r3 = new Rectangle(15.0, 22.0);
        displayObjectAttribute(r3);
        findArea(r3);




    }

    private static void findArea(Rectangle r) {
        System.out.println("Area of rectangle: "+r.findRectangleArea());
    }

    private static void displayObjectAttribute(Rectangle r) {
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
    }
}
