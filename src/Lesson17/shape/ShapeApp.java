package Lesson17.shape;

public class ShapeApp {
    public static void main(String[] args) {
        Line l1 = new Line('*',10);
       // l1.draw();

        Rectangle r1= new Rectangle('!',5,3);
        //r1.draw();
        Line l2 = new Line('+',20);
        Picture p1 = new Picture('0',new Shape[]{l1,r1,l2});
        p1.draw();
    }
}
