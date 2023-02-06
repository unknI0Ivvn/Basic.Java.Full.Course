package Lesson17.shape;

public class Line extends Shape {
    private int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    public void draw(){
        for (int i = 0; i <length ; i++) {
            System.out.println();

        }
    }
}
