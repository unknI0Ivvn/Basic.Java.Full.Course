package Lesson17.shape;

public abstract class Shape {
    private char symbol;

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract void draw();
}
