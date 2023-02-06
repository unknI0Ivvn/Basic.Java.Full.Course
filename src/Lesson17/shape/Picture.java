package Lesson17.shape;

public class Picture extends Shape {
    private Shape[] array;

    public Picture(char symbol, Shape[] array) {
        super('0');
        this.array = array;
    }
    @Override
    public void draw(){
        for(Shape s:array){
            s.draw();
        }
    }
}
