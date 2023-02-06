package Lesson18Homework.Converter;

public class CelsiusConverter implements Converter {
    private double temp;

    public CelsiusConverter(double temp) { // Celsius
        this.temp = temp;
    }

    @Override
    public double convert() {
        return 0;
    }
}
