package Lesson17.shape;

public class Rectangle extends Shape{
    private int width;
    private int height;

    @Override
    public void draw(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println(getSymbol());

            }
            System.out.println();
        }

    }

    public Rectangle(char symbol,int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
